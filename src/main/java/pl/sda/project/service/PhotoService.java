package pl.sda.project.service;


import pl.sda.project.domain.NewPhoto;
import pl.sda.project.entity.Photo;
import pl.sda.project.entity.User;


import java.util.List;
import java.util.Optional;


public interface PhotoService {

        void addPhoto(NewPhoto newPhoto,long id);
        List<Photo> findByTitle(String title);
        List<Photo> findByTag(String label);
        List<Photo> findByRate(int rate);
        void deletePhotoByTitle(String title);
        boolean isLogged(User user, String password);

    }

