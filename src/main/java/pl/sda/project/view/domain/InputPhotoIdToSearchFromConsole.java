package pl.sda.project.view.domain;

import java.util.Scanner;

public class InputPhotoIdToSearchFromConsole {
    private final Scanner scanner;


    public InputPhotoIdToSearchFromConsole(Scanner scanner) {
        this.scanner = scanner;
    }
    public long putPhotoId(){
        System.out.println("photo ID");
        return scanner.nextLong();
    }
}
