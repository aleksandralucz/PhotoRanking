package pl.sda.project.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.sda.project.domain.NewPhoto;
import pl.sda.project.entity.Photo;

import java.util.Optional;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {
    Optional<NewPhoto> findAll(String title);

    @Query("SELECT max(p.id) FROM Photo p")
    String maxId();
}
