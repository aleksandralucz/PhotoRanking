package pl.sda.project.service;


import org.springframework.stereotype.Service;

import pl.sda.project.domain.NewPhoto;
import pl.sda.project.domain.Ranking;
import pl.sda.project.entity.Metadata;
import pl.sda.project.entity.Photo;
import pl.sda.project.mapper.PhotoMapper;
import pl.sda.project.repository.PhotoRepository;

import java.util.List;
import java.util.Optional;


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
    public Optional<Photo> findByTitle(String title) {
        return Optional.empty();
    }

    @Override
    public Optional<Photo> findByTag(String label) {
        return Optional.empty();
    }

    @Override
    public Optional<Ranking> findByRate(int rate) {
        return Optional.empty();
    }
}