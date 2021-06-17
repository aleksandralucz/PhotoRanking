package pl.sda.project.service;


import org.springframework.stereotype.Service;

import pl.sda.project.domain.NewPhoto;
import pl.sda.project.domain.UserLogin;
import pl.sda.project.entity.*;
import pl.sda.project.mapper.PhotoMapper;
import pl.sda.project.repository.CameraRepository;
import pl.sda.project.repository.PhotoRepository;
import pl.sda.project.repository.TagRepository;
import pl.sda.project.repository.UserRepository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Service
public class PhotoServiceJpa implements PhotoService {
    private final UserRepository userRepository;
    private final PhotoRepository photoRepository;
    private final CameraRepository cameraRepository;
    private final TagRepository tagRepository;


    public PhotoServiceJpa(UserRepository userRepository, PhotoRepository photoRepository, CameraRepository cameraRepository, TagRepository tagRepository) {
        this.userRepository = userRepository;
        this.photoRepository = photoRepository;
        this.cameraRepository = cameraRepository;
        this.tagRepository = tagRepository;
    }

    @Override
    public void addPhoto(NewPhoto newPhoto) {
        long id=userRepository.findRegisteredUser().getId();
        Photo photo=PhotoMapper.INSTANCE.toEntity(newPhoto);
        Camera camera=cameraRepository.findByBrand(newPhoto.getCamera());
        photo.setCamera(camera);
        photo.setUser(userRepository.findUserById(id));
        List<Tag> tagList=tagRepository.findAll();
        Set<Tag> tagSet=new HashSet<>();
        newPhoto.getTags().forEach(t-> {
            Tag tag = tagRepository.findByLabel(t);
            tagSet.add(tag);
            if (!tagList.contains(tag)){
                Tag newTag=new Tag();
                newTag.setLabel(t);
                tagRepository.save(newTag);
            }
        });
        photo.setTags(tagSet);
        Metadata metadata=new Metadata();
        metadata.setDescription(newPhoto.getDescription());
        metadata.setRate(newPhoto.getRate());
        metadata.setSize(newPhoto.getSize());
        metadata.setTitle(newPhoto.getTitle());




        photoRepository.save(photo);

    }

    @Override
    public List<NewPhoto> findByTitle(String title) {
        List<NewPhoto> newPhotos=new ArrayList<>();
        photoRepository.findByTitle(title)
                .forEach(p->newPhotos.add(PhotoMapper.INSTANCE.toDomain(p)));
        return newPhotos;
    }





    @Override
    public void deletePhotoByTitle(String title) {

    }

    @Override
    public boolean isLogged(User user, String password) {
        return false;
    }

    @Override
    public void loginUser(UserLogin userLogin) {
        User user=userRepository.findUserByGmail(userLogin.getGmail());
        if (user.getPassword().equals(userLogin.getPassword())){
            logOutAllUsers();
            user.setRegistered(true);
            userRepository.save(user);
            System.out.println("logged in user with id: "+user.getId());
        }else {
            System.out.println("wrong password or email");
        }

    }

    @Override
    public void logOutAllUsers() {
        List<User> users=userRepository.findAll();
        for (User user:users){
            user.setRegistered(false);
            userRepository.save(user);
        }

    }

    @Override
    public NewPhoto findById(long id) {
        Photo photo=photoRepository.findById(id);
        return PhotoMapper.INSTANCE.toDomain(photo);
    }

    @Override
    public List<NewPhoto> findPhotoByCameraBrand(String brand) {
        List<NewPhoto> newPhotos=new ArrayList<>();
        photoRepository.findByCameraBrand(brand)
                .forEach(p->newPhotos.add(PhotoMapper.INSTANCE.toDomain(p)));
        return newPhotos;
    }

    @Override
    public void deletePhoto(long id) {

        Photo photo=photoRepository.findById(id);
        User user=userRepository.findRegisteredUser();
        if (photo.getUser().getId()==user.getId()){

            photoRepository.delete(photo);
            System.out.println("Photo removed");
        }else {
            System.out.println("the photo has not been deleted");
        }

    }


//    @Override
//    public boolean isLogged(User user, String password) {
////        return userRepository.findById(user.getId());
////                .stream()
////                .filter(userRepository)
////                .collect(Collectors.toList());
//////                .filter(users -> users.getEmailAddress().contains(user.getEmailAddress()))
//////                .collect(Collectors.toList()
//
//    }
}