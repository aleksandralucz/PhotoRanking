package pl.sda.project.view.domain;

import pl.sda.project.domain.UserLogin;

import java.util.Scanner;

public class UserLoginFromConsole {
    private final Scanner scanner;

    public UserLoginFromConsole(Scanner scanner) {
        this.scanner = scanner;
    }

    public UserLogin login(){
        System.out.println("gmail: ");
        String gmail=scanner.nextLine();
        System.out.println("password: ");
        String password=scanner.nextLine();
        return UserLogin.builder()
                .gmail(gmail)
                .password(password)
                .build();
    }

}
