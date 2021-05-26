package pl.sda.project.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewPhoto{
    private int size;
    private int rate;
    private String description;
    private String title;
    private String tag;


}

