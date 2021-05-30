package pl.sda.project.repository;


import pl.sda.project.entity.Camera;
import pl.sda.project.entity.Photo;

import java.util.List;


public interface Repository {

    void save(Photo photo);
    void remove(Photo photo);
    List<Photo> findAll();
    List<Photo> findByPhotoTitle(String title);
    List<Camera>findByCameraBrand(String brand);

}