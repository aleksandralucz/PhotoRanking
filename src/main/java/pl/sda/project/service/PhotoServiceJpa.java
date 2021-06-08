package pl.sda.project.service;


import org.springframework.stereotype.Service;

import pl.sda.project.domain.NewPhoto;
import pl.sda.project.entity.Camera;
import pl.sda.project.entity.Photo;
import pl.sda.project.entity.Tag;
import pl.sda.project.entity.User;
import pl.sda.project.mapper.PhotoMapper;
import pl.sda.project.repository.CameraRepository;
import pl.sda.project.repository.PhotoRepository;
import pl.sda.project.repository.TagRepository;
import pl.sda.project.repository.UserRepository;

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
    public void addPhoto(NewPhoto newPhoto,long id) {
        Photo photo=PhotoMapper.INSTANCE.toEntity(newPhoto);
        Camera camera=cameraRepository.findByBrand(newPhoto.getCamera());
        photo.setCamera(camera);
        photo.setUser(userRepository.findUserById(id));
        List<Tag> tagList=tagRepository.findAll();
        Set<Tag> tagSet=new HashSet<>();




        photoRepository.save(photo);

    }

    @Override
    public List<Photo> findByTitle(String title) {
        return photoRepository.findAll()
                .stream()
                .filter(photo -> photo.getMetadata().getTitle().contains(title))
                .collect(Collectors.toList());
    }

    @Override
    public List<Photo> findByTag(String label) {
        return photoRepository.findAll()
                .stream()
//                .filter(photo -> photo)
                .collect(Collectors.toList());
    }

    @Override
    public List<Photo> findByRate(int rate) {
        return photoRepository.findAll();
//                .stream()
//                .filter(photo -> photo.getMetadata().getRate();
    }

    @Override
    public void deletePhotoByTitle(String title) {

    }

    @Override
    public boolean isLogged(User user, String password) {
        return false;
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