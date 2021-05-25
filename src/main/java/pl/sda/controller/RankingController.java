package pl.sda.controller;
import pl.sda.view.core.Menu;
import pl.sda.service.PhotoService;
import pl.sda.view.core.ConsoleLooper;
import pl.sda.view.core.ConsoleView;

import java.util.Scanner;

public class RankingController {
    private final ConsoleLooper looper;
    private final ConsoleView view;
    private final Scanner input = new Scanner(System.in);

    public RankingController(PhotoService photoService) {
        Menu menu = new Menu();
        view = new ConsoleView(menu, System.in);
        looper = new ConsoleLooper(view);
    }

    public void start() {
        looper.runLoop();
    }

}
