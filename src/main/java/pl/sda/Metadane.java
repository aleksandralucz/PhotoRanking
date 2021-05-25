package pl.sda;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Metadane {
    private long id;
    private int size;
    private int rate;
    private String description;
    private String title;
    private String tag;
}
