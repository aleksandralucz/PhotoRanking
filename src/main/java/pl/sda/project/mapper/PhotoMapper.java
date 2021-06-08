package pl.sda.project.mapper;

import pl.sda.project.domain.NewPhoto;

import pl.sda.project.entity.*;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Set;


public enum PhotoMapper {
    INSTANCE;

    public Photo toEntity(NewPhoto newPhoto) {

        return Photo.builder()
                .metadata(Metadata.builder()
                        .size(newPhoto.getSize())
                        .title(newPhoto.getTitle())
                        .description(newPhoto.getDescription())
                        .rate(newPhoto.getRate())
                        .build())
                .registered(Timestamp.valueOf(LocalDateTime.now()))
                .build();
    }

    public NewPhoto toDomain(Photo photo) {
        return NewPhoto.builder()
                .title(photo.getMetadata().getTitle())
                .rate(photo.getMetadata().getRate())
                .size(photo.getMetadata().getSize())
                .description(photo.getMetadata().getDescription())
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