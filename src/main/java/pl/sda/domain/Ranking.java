package pl.sda.domain;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Ranking {
    private int rate;
    private String title;
    private String tag;
}
