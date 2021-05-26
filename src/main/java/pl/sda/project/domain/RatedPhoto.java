package pl.sda.project.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class RatedPhoto {

   private String UserName;
   private String DescriptionPhoto;
   private String TitlePhoto;
   private int rating;

}
