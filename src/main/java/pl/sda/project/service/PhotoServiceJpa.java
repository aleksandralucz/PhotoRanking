package pl.sda.project.service;


import org.springframework.stereotype.Service;

import pl.sda.project.domain.NewPhoto;
import pl.sda.project.entity.Photo;
import pl.sda.project.entity.User;
import pl.sda.project.mapper.PhotoMapper;
import pl.sda.project.repository.PhotoRepository;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class PhotoServiceJpa implements PhotoService {


    private final PhotoRepository photoRepository;

    public PhotoServiceJpa(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    @Override
    public void addPhoto(NewPhoto newPhoto) {
        photoRepository.save(PhotoMapper.INSTANCE.toEntity(newPhoto));

    }

    @Override
    public List<NewPhoto> findByTitle(String title) {
        return photoRepository.findAll().stream()
                .map(PhotoMapper.INSTANCE.toDomain()).collect(Collectors.toList());
    }

    @Override
    public List<NewPhoto> findByTag(String label) {
        return photoRepository.findAll().stream()
                .map(PhotoMapper.INSTANCE.toDomain(label)).collect(Collectors.toList());
    }

    @Override
    public List<NewPhoto> findByRate(int rate) {
        return photoRepository.findAll().stream()
                .map(PhotoMapper.INSTANCE::toDomain(rate)).collect(Collectors.toList());
    }

    @Override
    public boolean isLogged(User user) {
        return photoRepository.findById(user.getId())
                .stream()
                .map((Photo user1) ->
                        PhotoMapper.INSTANCE.toFront(user))
                .filter(User::isRegistered)
                .isParallel();
    }
}