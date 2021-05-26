package pl.sda.project.view.domain;

import java.util.Scanner;

public class InputPhotoIdToSearchFromConsole {
    private final Scanner scanner;


    public InputPhotoIdToSearchFromConsole(Scanner scanner) {
        this.scanner = scanner;
    }
    public String putPhotoId(){
        System.out.println("photo ID");
        return scanner.nextLine();
    }
}
