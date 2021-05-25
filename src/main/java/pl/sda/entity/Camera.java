package pl.sda.entity;
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
    private long serialNumber;
    private String brand;
    private int rating;

}
