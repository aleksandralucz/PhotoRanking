package pl.sda.view.domain;

import java.util.Scanner;

public class InputNewMetadaneFromConsole {
    private final Scanner scanner;

    public InputNewMetadaneFromConsole(Scanner scanner) {
        this.scanner = scanner;
    }

    public void inputNewPhoto() {
        System.out.println("TEST");
        String question = scanner.nextLine();
        System.out.println("TEST 2");
    }
}


