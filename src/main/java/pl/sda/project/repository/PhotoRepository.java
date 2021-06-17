package pl.sda.project.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.sda.project.entity.Camera;
import pl.sda.project.entity.Photo;

import java.util.List;
@org.springframework.stereotype.Repository

public interface PhotoRepository extends JpaRepository<Photo, Long> {

    @Query("select p from Photo p where p.metadata.title = :title")
    List<Photo> findByTitle(String title);

    @Query("select p from Photo p where p.id = :id")
    Photo findById(long id);




//

    @Query("select p from Photo p where p.camera.brand like :brand")
    List<Photo> findByCameraBrand(String brand);

    @Query("select p from Photo p where p.metadata.rate = :rate")
    List<Photo> findByRate(int rate);


}



//    void save(Photo photo);
//    void remove(Photo photo);
//    List<Photo> findAll();
//    List<Photo> findByPhotoTitle(String title);
//    List<Camera>findByCameraBrand(String brand);

