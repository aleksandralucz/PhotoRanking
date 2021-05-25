package pl.sda.domain;

import lombok.Builder;
import lombok.Data;
// to informacje o fotografii, ale bez id, daty dodania itd. czyli tylko te dane, które wpisuje użytkownik.

@Data
@Builder
public class NewPhoto{
    private int size;
    private int rate;
    private String description;
    private String title;
    private String tag;

}

