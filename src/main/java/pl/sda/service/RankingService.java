package pl.sda.service;


import pl.sda.Metadane;
import pl.sda.domain.NewPhoto;

import java.util.List;
import java.util.Optional;

public interface RankingService {
    void addPhoto(NewPhoto newPhoto);
    Optional<Metadane>findById(long id);
    List<Metadane> findAll();


}
