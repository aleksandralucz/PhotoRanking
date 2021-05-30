package pl.sda.project.mapper;

import pl.sda.project.domain.NewPhoto;
import pl.sda.project.domain.Ranking;
import pl.sda.project.domain.RatedPhoto;
import pl.sda.project.entity.Camera;
import pl.sda.project.entity.Metadata;
import pl.sda.project.entity.Photo;
import pl.sda.project.entity.User;


import java.sql.Timestamp;
import java.time.LocalDateTime;


public enum PhotoMapper {
    INSTANCE;

    public Photo toEntity(NewPhoto newPhoto) {
        return Photo.builder()
                .metadata(Metadata.builder()
                        .size(newPhoto.getSize())
                        .title(newPhoto.getTitle())
                        .description(newPhoto.getDescription())
                        .tag(newPhoto.getTag())
                        .rate(newPhoto.getRate())
                        .build()).
                        cameras(Camera.builder().build()).
                        user(User.builder().build()).
                        registered(Timestamp.valueOf(LocalDateTime.now()))
                .build();
    }
    public NewPhoto toDomain(Metadata metadata){
        return NewPhoto.builder()
                .title(metadata.getTitle())
                .tag(metadata.getTag())
                .rate(metadata.getRate())
                .build();
    }

    public User toFront(User user) {
        return User.builder()
                .id(user.getId())
                .EmailAddress(user.getEmailAddress())
                .isRegistered(user.isRegistered())
                .build();
    }

}