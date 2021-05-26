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
@Table(name = "PHOTOS")
public class Photo {
    @Id
    private long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Embedded
    private Metadata metadata;

    private Timestamp registered;

    @EqualsAndHashCode.Exclude
    @ManyToOne
    private Camera cameras;

    @EqualsAndHashCode.Exclude
    @ManyToOne
    private User user;

    @EqualsAndHashCode.Exclude
    @ManyToMany
    private Set <Tag> tags = new HashSet<>();

}
