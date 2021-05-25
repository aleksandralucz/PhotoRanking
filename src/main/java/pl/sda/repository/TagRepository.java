package pl.sda.repository;

import pl.sda.entity.Photo;
import pl.sda.entity.Tag;

import java.util.List;

public interface TagRepository <T, L extends Number> extends Repository<Tag, Long>{
    List<Photo> findPhotoByTag(long id);
}