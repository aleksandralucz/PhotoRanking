package pl.sda.project.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.sda.project.entity.Photo;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {
    @Query("SELECT max(p.id) FROM Photo p")
    long maxId();
}
