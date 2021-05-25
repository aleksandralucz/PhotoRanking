package pl.sda.project.controller;
import pl.sda.project.view.core.Menu;
import pl.sda.project.service.PhotoService;
import pl.sda.project.view.core.ConsoleLooper;
import pl.sda.project.view.core.ConsoleView;

import java.util.Scanner;

public class RankingController {
    private final ConsoleLooper looper;
    private final Scanner input = new Scanner(System.in);

    public RankingController(PhotoService photoService) {
        Menu menu = new Menu();
        ConsoleView view = new ConsoleView(menu, System.in);
        looper = new ConsoleLooper(view);

//        menu.addMenuItem(
//                "Add new!!!",
//                () -> new InputNewMetadataFromConsole(input).inputNewPhoto().
//        ));
    }

    public void start() {
        looper.runLoop();
    }

}
