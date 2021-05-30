package pl.sda.project.controller;

import pl.sda.project.domain.NewPhoto;
import pl.sda.project.view.core.Menu;
import pl.sda.project.service.PhotoService;
import pl.sda.project.view.core.ConsoleLooper;
import pl.sda.project.view.core.ConsoleView;
import pl.sda.project.view.core.MenuItem;

import pl.sda.project.view.domain.*;


import java.util.List;
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
                        }));
        menu.addMenuItem(
                new MenuItem("Find photo by camera brand",
                        () -> {
                            ShowPhotoByCamerasBrand brand = new ShowPhotoByCamerasBrand(input);
                            String searchedCamera = brand.putCameraBrand();
                            System.out.println("Searched photo by camera's brand is: " + searchedCamera);
                        })
        );

        menu.addMenuItem(
                new MenuItem("Find photo by title",
                        () -> {
                            AskUserFOrPhotoTitleToSearchFromConsole ask = new AskUserFOrPhotoTitleToSearchFromConsole(input);
                            String title = ask.putPhotoTitle();
                            photoService.findByTitle(title).notify();

                        })
        );

        menu.addMenuItem(
                new MenuItem("Add new photo",
                        () -> {
                            InputNewPhotoFromConsole putNewPhoto = new InputNewPhotoFromConsole(input);
                            NewPhoto addNew = putNewPhoto.putNewPhoto();
                            System.out.println(addNew);
                        })
        );
        menu.addMenuItem(
                new MenuItem(
                        "EXIT",
                        Menu.DEFAULT_QUIT
                ));
    }
    public void start() {
        looper.runLoop();
    }
}