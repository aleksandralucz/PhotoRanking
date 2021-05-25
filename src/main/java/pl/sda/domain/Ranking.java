package pl.sda.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Objects;
@Data
@Builder
public class Ranking {
    private long id;
    private String question;
    private String[] options;
    private String answer;
    private boolean accepted;

    public boolean isValidUserAnswer(UserAnswer userAnswer){
        return Objects.equals(answer, userAnswer.getAnswer());
    }
}
