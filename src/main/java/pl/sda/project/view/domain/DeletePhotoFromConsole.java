package pl.sda.project.view.domain;

import pl.sda.project.domain.NewPhoto;

import java.util.Scanner;

public class DeletePhotoFromConsole {
    private final Scanner scanner;

    public DeletePhotoFromConsole(Scanner scanner) {
        this.scanner = scanner;

    }

    public String deletePhotoByTitle() {
        System.out.println("Do you want delete photo: " + scanner);
        return scanner.nextLine();
    }
    }


