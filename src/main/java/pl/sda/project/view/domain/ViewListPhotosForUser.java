package pl.sda.project.view.domain;

import pl.sda.project.domain.NewPhoto;

import java.util.List;

public class ViewListPhotosForUser {
    private List<NewPhoto> photos;

    public ViewListPhotosForUser(List<NewPhoto> photos) {
        this.photos = photos;
    }
    public void print(){
        photos.forEach(System.out::println);
    }
}
