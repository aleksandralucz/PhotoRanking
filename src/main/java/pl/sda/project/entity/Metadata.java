package pl.sda.project.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Metadata {

    private int size;
    private int rate;
    private String description;
    private String title;
    private String tag;

}
