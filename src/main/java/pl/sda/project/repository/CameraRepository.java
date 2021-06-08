package pl.sda.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.sda.project.entity.Camera;

public interface CameraRepository extends JpaRepository<Camera, Long> {

    @Query("select c from Camera c where c.brand = :brand")
    Camera findByBrand(String brand);

}
