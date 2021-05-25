package pl.sda.project.service;



import pl.sda.project.domain.NewPhoto;
import pl.sda.project.metadata.Metadata;

import java.util.List;
import java.util.Optional;

public interface RankingService {
    void addPhoto(NewPhoto newPhoto);
    Optional<Metadata>findById(long id);
    List<Metadata> findAll();


}
