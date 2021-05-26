package pl.sda.project.service;


import pl.sda.project.domain.NewPhoto;

import pl.sda.project.domain.Ranking;
import pl.sda.project.entity.Photo;


import java.util.List;
import java.util.Optional;


public interface PhotoService {

        void addPhoto(NewPhoto newPhoto);
        Optional<Photo>findByTitle(String title);
        Optional<Photo> findByTag(String label);
        Optional<Ranking> findByRate(int rate);

    }

