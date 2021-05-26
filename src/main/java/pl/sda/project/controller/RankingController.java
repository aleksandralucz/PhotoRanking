package pl.sda.project.controller;

import pl.sda.project.view.core.Menu;
import pl.sda.project.service.PhotoService;
import pl.sda.project.view.core.ConsoleLooper;
import pl.sda.project.view.core.ConsoleView;
import pl.sda.project.view.core.MenuItem;

import pl.sda.project.view.domain.InputNewPhotoFromConsole;
import pl.sda.project.view.domain.InputPhotoIdToSearchFromConsole;
import pl.sda.project.view.domain.InputPhotoTitleToSearchFromConsole;


import java.util.Scanner;

public class RankingController {
    private final ConsoleLooper looper;
    private final ConsoleView view;
    private final Scanner input = new Scanner(System.in);

    public RankingController(PhotoService photoService) {
        Menu menu = new Menu();
        view = new ConsoleView(menu, System.in);
        looper = new ConsoleLooper(view);
        menu.addMenuItem(
                new MenuItem("Find photo by ID",
                        () -> {
                            InputPhotoIdToSearchFromConsole idPhoto = new InputPhotoIdToSearchFromConsole(input);
                            String searchedPhotoId = idPhoto.putPhotoId();
                            System.out.println("Searched photo is: " + searchedPhotoId);
                        })
        );
        menu.addMenuItem(
                new MenuItem("Find photo by title",
                        () -> {
                            InputPhotoTitleToSearchFromConsole title = new InputPhotoTitleToSearchFromConsole(input);
                            String searchedPhotoTitle = title.putPhotoTitle();
                            System.out.println("Searched photo is: " + searchedPhotoTitle);
                        })
        );
        menu.addMenuItem(
                new MenuItem("Add new photo",
                        () -> {
                            InputNewPhotoFromConsole addPhoto = new InputNewPhotoFromConsole(input);
                            String addNewPhoto = addPhoto.putNewPhoto();
                            System.out.println("Searched photo is: " + addNewPhoto);
                        })
        );
        menu.addMenuItem(new MenuItem(
                "EXIT",
                Menu.DEFAULT_QUIT
        ));

    }
    public void start() {
        looper.runLoop();
    }
}
