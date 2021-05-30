package pl.sda.project.view.domain;

import java.util.Scanner;

public class AskUserFOrPhotoTitleToSearchFromConsole {
    private final Scanner scanner;


    public AskUserFOrPhotoTitleToSearchFromConsole(Scanner scanner) {
        this.scanner = scanner;
    }
    public String putPhotoTitle(){
        System.out.println("photo title");
        return scanner.nextLine();
    }
}
