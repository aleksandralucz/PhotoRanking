package pl.sda.project.entity;
import lombok.*;
import pl.sda.project.domain.Ranking;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "photos")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Embedded
    private Metadata metadata;

    private Timestamp registered;

    @EqualsAndHashCode.Exclude
    @ManyToOne
    private Camera camera;

    @EqualsAndHashCode.Exclude
    @ManyToOne
    private User user;

    @EqualsAndHashCode.Exclude
    @ManyToMany(fetch = FetchType.EAGER)
    private Set <Tag> tags = new HashSet<>();

}
