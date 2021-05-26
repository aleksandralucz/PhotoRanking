package pl.sda.project.view.domain;

import java.util.Scanner;

public class InputNewPhotoFromConsole {
    private final Scanner scanner;

    public InputNewPhotoFromConsole(Scanner scanner) {
        this.scanner = scanner;
    }

    public String putNewPhoto() {
        System.out.println("add photo");
        return scanner.nextLine();
    }
}