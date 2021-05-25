package pl.sda.project.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserAnswer {
    private long cameraId;
    private long photoId;
    private String userEmailAddress;
    private String answer;
    private String userPassword;
    private boolean userIsRegistered;

}
