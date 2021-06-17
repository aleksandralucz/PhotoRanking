package pl.sda.project.view.domain;

import pl.sda.project.domain.NewPhoto;
import pl.sda.project.service.PhotoServiceJpa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

        System.out.println("How many tags you want to add?");
        int count=scanner.nextInt();
        Set<String> tags = new HashSet<>();
        for (int i=0;i<count;i++){
            System.out.println("Add tag of photo");
            String addTag = scanner.next();
            tags.add(addTag);
        }




        System.out.println("Add size of photo");
        int addSize = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Add rate of photo from 1 to 10");
        int addRate = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Add camera");
        String addCamera = scanner.next();



        return NewPhoto.builder()
                .title(title)
                .description(addDesc)
                .tags(tags)
                .rate(addRate)
                .size(addSize)
                .camera(addCamera)
                .build();

        }
    }

