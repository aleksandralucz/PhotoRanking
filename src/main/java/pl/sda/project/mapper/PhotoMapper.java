package pl.sda.project.mapper;

import pl.sda.project.domain.NewPhoto;
import pl.sda.project.domain.Ranking;
import pl.sda.project.entity.Camera;
import pl.sda.project.entity.Metadata;
import pl.sda.project.entity.Photo;
import pl.sda.project.entity.User;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

public enum PhotoMapper {
    INSTANCE;

    public Photo toEntity(NewPhoto newPhoto) {
        return Photo.builder()
                .metadata(Metadata.builder()
                        .size(newPhoto.getSize())
                        .rate(newPhoto.getRate())
                        .title(newPhoto.getTitle())
                        .description(newPhoto.getDescription())
                        .tag(newPhoto.getTag())
                        .build()).
                cameras(Camera.builder().build()).
                user(User.builder().build()).
                registered(Timestamp.valueOf(LocalDateTime.now()))
                .build();
    }



//    public Photo toEntity(Ranking ranking) {
//        return Ranking.builder()
//                .photoId(ranking.getPhotoId())
//                .cameraId(ranking.getCameraId())
//                .rate(ranking.getRate())
//                .build()
//    }
}
