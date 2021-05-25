package pl.sda.view.domain;

import java.util.Scanner;

public class AskForPhotoId {
    private final Scanner scanner;

    public AskForPhotoId(Scanner scanner) {
        this.scanner = scanner;
    }
    public long AskForId(){
        System.out.println("Give ID");
        return scanner.nextLong();
    }
}
