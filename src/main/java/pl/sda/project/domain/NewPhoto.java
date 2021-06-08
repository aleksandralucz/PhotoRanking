package pl.sda.project.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class NewPhoto{
    private String title;
    private String description;
    private Set<String> tags;
    private int size;
    private int rate;
    private String camera;


}

