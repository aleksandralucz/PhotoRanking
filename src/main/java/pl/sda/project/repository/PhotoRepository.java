package pl.sda.project.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.sda.project.entity.Photo;

public interface PhotoRepository extends JpaRepository<Photo, Long> {
    @Query("SELECT max(p.id) FROM Photo p")
    long maxId();
}
