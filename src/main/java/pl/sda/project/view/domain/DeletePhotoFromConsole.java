package pl.sda.project.view.domain;

import pl.sda.project.domain.NewPhoto;

import java.util.Scanner;

public class DeletePhotoFromConsole {
    private final Scanner scanner;

    public DeletePhotoFromConsole(Scanner scanner) {
        this.scanner = scanner;

    }

    public long deletePhotoById() {
        System.out.println("Enter the id of the photo you want to delete: ");
        return scanner.nextLong();
    }
    }


