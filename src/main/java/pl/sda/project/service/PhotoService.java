package pl.sda.project.service;


import pl.sda.project.domain.NewPhoto;
import pl.sda.project.entity.User;


import java.util.List;
import java.util.Optional;


public interface PhotoService {

        void addPhoto(NewPhoto newPhoto);
        List<NewPhoto> findByTitle(String title);
        List<NewPhoto> findByTag(String label);
        List<NewPhoto> findByRate(int rate);
        boolean isLogged(User user);

    }

