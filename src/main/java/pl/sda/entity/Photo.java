package pl.sda.entity;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
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

    private Timestamp registered;

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "photos", fetch = FetchType.LAZY)
    private Set<Camera> cameras = new HashSet<>();

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "photos", fetch = FetchType.LAZY)
    private Set<User> user = new HashSet<>();


}
