package pl.sda.project.view.domain;

import java.util.Scanner;

public class ShowPhotoByCamerasBrand {
    private final Scanner scanner;


    public ShowPhotoByCamerasBrand(Scanner scanner) {
        this.scanner = scanner;
    }
    public String putCameraBrand(){
        System.out.println("camera brand " );
        return scanner.nextLine();
    }
}
