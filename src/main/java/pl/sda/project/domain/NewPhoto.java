package pl.sda.project.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewPhoto{
    private String title;
    private String description;
    private String tag;
    private int size;
    private int rate;


}

