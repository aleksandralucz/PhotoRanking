package pl.sda.project.service;


import pl.sda.project.domain.NewPhoto;
import pl.sda.project.metadata.Metadata;

import java.util.List;


public interface PhotoService {

        void addPhoto(NewPhoto newPhoto);
        List<Metadata> findAll();

    }

