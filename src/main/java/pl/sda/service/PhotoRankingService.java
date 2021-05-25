package pl.sda.service;

import pl.sda.domain.NewPhoto;

import java.util.List;
import java.util.Optional;

public interface PhotoRankingService {

        void addPhoto(NewPhoto newPhoto);
        List<NewPhoto> findAll();
        Optional<NewPhoto> findRandom();

    }

