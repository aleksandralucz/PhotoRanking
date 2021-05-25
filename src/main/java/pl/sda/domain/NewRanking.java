package pl.sda.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@AllArgsConstructor
@Data
@Builder
public class NewRanking {
    private String question;
    private String[] options;
    private String answer;
}
