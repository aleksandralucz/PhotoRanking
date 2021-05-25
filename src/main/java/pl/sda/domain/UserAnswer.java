package pl.sda.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserAnswer {
    private long cameraSerialNumber;
    private long photoId;
    private String userEmailAddress;
    private String answer;
}
