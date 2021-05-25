package pl.sda.project.entity;
import lombok.*;
import javax.persistence.*;
import java.util.Set;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "CAMERAS")
public class Camera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String brand;
    private int rating;

    @EqualsAndHashCode.Exclude
    @OneToMany(fetch = FetchType.LAZY)
    private Set<Photo> photo;

    @EqualsAndHashCode.Exclude
@OneToMany (fetch = FetchType.LAZY)
    private Set<User> users;


}
