package pl.sda.project.service;


import pl.sda.project.domain.NewPhoto;
import pl.sda.project.domain.UserLogin;
import pl.sda.project.entity.Photo;
import pl.sda.project.entity.User;


import java.util.List;
import java.util.Optional;


public interface PhotoService {

        void addPhoto(NewPhoto newPhoto);
        List<NewPhoto> findByTitle(String title);

        void deletePhotoByTitle(String title);
        boolean isLogged(User user, String password);
        void loginUser(UserLogin userLogin);
        void logOutAllUsers();
        NewPhoto findById(long id);
        List<NewPhoto> findPhotoByCameraBrand(String brand);
        void deletePhoto(long id);

    }

