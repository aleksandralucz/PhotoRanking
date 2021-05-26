package pl.sda.project.service;


import org.springframework.stereotype.Service;

import pl.sda.project.domain.NewPhoto;
import pl.sda.project.metadata.Metadata;
import pl.sda.project.repository.PhotoRepository;

import java.util.List;



@Service
public class PhotoServiceJpa implements PhotoService {


    private final PhotoRepository photoRepository;

    public PhotoServiceJpa(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    @Override
    public void addPhoto(NewPhoto newPhoto) {
//        photoRepository.save()

    }

    @Override
    public List<Metadata> findAll() {
        return null;
    }
}
