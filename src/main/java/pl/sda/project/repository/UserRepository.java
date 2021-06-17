package pl.sda.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.sda.project.entity.Photo;
import pl.sda.project.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();

    @Query("select u from User u where u.id = :id")
    User findUserById (long id);
    @Query("select u from User u where u.isRegistered=true ")
    User findRegisteredUser();
    @Query("select u from User u where u.EmailAddress = :gmail")
    User findUserByGmail (String gmail);


}
