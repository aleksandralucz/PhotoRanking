package pl.sda.project.view.domain;

import java.util.Scanner;

public class ShowPhotoRankingByTitleFromConsole {
    private final Scanner scanner;


    public ShowPhotoRankingByTitleFromConsole(Scanner scanner) {
        this.scanner = scanner;
    }
    public String putPhotoTitle(){
        System.out.println("photo title");
        return scanner.nextLine();
    }
}
