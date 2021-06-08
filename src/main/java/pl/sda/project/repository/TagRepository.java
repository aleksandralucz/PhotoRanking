package pl.sda.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.project.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {

}
