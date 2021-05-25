package pl.sda.project.entity;
import lombok.*;

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
    @ManyToOne
    private Camera cameras;

    @EqualsAndHashCode.Exclude
    @ManyToOne
    private User user;

    @EqualsAndHashCode.Exclude
    @ManyToMany
    private Set <Tag> tags = new HashSet<>();


}
