package pl.sda.project.entity;
import lombok.*;
import javax.persistence.*;


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

    @ManyToOne(fetch = FetchType.LAZY)
    private Photo photo;

    @ManyToOne(fetch = FetchType.LAZY)
    private User users;


}
