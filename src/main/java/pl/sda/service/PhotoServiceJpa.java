package pl.sda.service;


import org.springframework.stereotype.Service;
import pl.sda.Metadane;
import pl.sda.domain.NewPhoto;
import pl.sda.repository.PhotoRepository;
import java.util.List;



@Service
public class PhotoServiceJpa implements PhotoService {


    private final PhotoRepository photoRepository;

    public PhotoServiceJpa(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    @Override
    public void addPhoto(NewPhoto newPhoto) {

    }

    @Override
    public List<Metadane> findAll() {
        return null;
    }
}
