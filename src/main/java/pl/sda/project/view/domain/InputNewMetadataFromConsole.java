package pl.sda.project.view.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class InputNewMetadataFromConsole {
    private final Scanner scanner;

    public InputNewMetadataFromConsole(Scanner scanner) {
        this.scanner = scanner;
    }

    public void inputNewPhoto() {
        System.out.println("Give");
        String question = scanner.nextLine();
        System.out.println("TEST 2");
    }
}
