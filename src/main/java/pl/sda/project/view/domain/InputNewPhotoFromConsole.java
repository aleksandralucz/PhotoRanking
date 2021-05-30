package pl.sda.project.view.domain;

import lombok.ToString;
import pl.sda.project.domain.NewPhoto;
import pl.sda.project.entity.Camera;

import java.util.Scanner;

public class InputNewPhotoFromConsole {
    private final Scanner scanner;

    public InputNewPhotoFromConsole(Scanner scanner) {
        this.scanner = scanner;
    }

    public NewPhoto putNewPhoto() {
        System.out.println("Metadata of new photo");

        System.out.println("Add title of photo");
        String title = scanner.next();


        System.out.println("Add short description of photo");
        String addDesc = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Add tag of photo");
        String addTag = scanner.nextLine();


        System.out.println("Add size of photo");
        int addSize = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Add rate of photo from 1 to 10");
        int addRate = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Add camera");
        String addCamera = scanner.next();

        return NewPhoto.builder()
                .title(putNewPhoto().getTitle())
                .description(putNewPhoto().getDescription())
                .tag(putNewPhoto().getTag())
                .rate(putNewPhoto().getRate())
                .build();

        }
    }

