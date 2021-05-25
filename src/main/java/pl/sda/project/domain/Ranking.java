package pl.sda.project.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Objects;


@Data
@Builder
public class Ranking {
    private long photoId;
    private long serialNumberOfCamera;
    private String[] options;
    private String answer;
    private boolean accepted;

    public boolean isUserRegistered(UserAnswer userAnswer) {
        if (userAnswer == null) {
            return false;
        }
        if (userAnswer.getPhotoId() != photoId) {
            return false;
        }
        return Objects.equals(answer, userAnswer.getAnswer());
    }
}
