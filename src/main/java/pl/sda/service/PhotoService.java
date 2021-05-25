package pl.sda.service;

import pl.sda.Metadane;
import pl.sda.domain.NewPhoto;

import java.util.List;


public interface PhotoService {

        void addPhoto(NewPhoto newPhoto);
        List<Metadane> findAll();

    }

