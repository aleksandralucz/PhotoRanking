package pl.sda.entity;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PHOTOS")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int size;
    private int rate;
    private String description;
    private String title;
    private String tag;
    private String camera;

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "photos", fetch = FetchType.LAZY)
    private Set<Camera> cameras = new HashSet<>();

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "photos", fetch = FetchType.LAZY)
    private Set<User> user = new HashSet<>();


}
