package pl.sda.project.controller;

import pl.sda.project.domain.NewPhoto;
import pl.sda.project.domain.UserLogin;
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
                new MenuItem("Login",
                        () -> {
                            UserLoginFromConsole userLoginFromConsole=new UserLoginFromConsole(input);
                            UserLogin userLogin=userLoginFromConsole.login();
                            photoService.loginUser(userLogin);

                        }));
        menu.addMenuItem(
                new MenuItem("Logout",
                        photoService::logOutAllUsers));
        menu.addMenuItem(
                new MenuItem("Find photo by ID",
                        () -> {
                            InputPhotoIdToSearchFromConsole idPhoto = new InputPhotoIdToSearchFromConsole(input);
                            long searchedPhotoId = idPhoto.putPhotoId();
                            System.out.println("Searched photo is: " + photoService.findById(searchedPhotoId));
                        }));
        menu.addMenuItem(
                new MenuItem("Find photo by camera brand",
                        () -> {
                            ShowPhotoByCamerasBrand brand = new ShowPhotoByCamerasBrand(input);
                            String searchedCamera = brand.putCameraBrand();
                            List<NewPhoto> photos=photoService.findPhotoByCameraBrand(searchedCamera);
                            System.out.println("Searched photo by camera's brand is: " + photos.toString());
                        })
        );

        menu.addMenuItem(
                new MenuItem("Find photo by title",
                        () -> {
                            AskUserFOrPhotoTitleToSearchFromConsole ask = new AskUserFOrPhotoTitleToSearchFromConsole(input);
                            String title = ask.putPhotoTitle();
                            List<NewPhoto> photos=photoService.findByTitle(title);
                            System.out.println("Searched photo by title is: " + photos.toString());

                        })
        );

        menu.addMenuItem(
                new MenuItem("Add new photo",
                        () -> {
                            InputNewPhotoFromConsole putNewPhoto = new InputNewPhotoFromConsole(input);
                            NewPhoto addNew = putNewPhoto.putNewPhoto();
                            photoService.addPhoto(addNew);
                            System.out.println(addNew);
                        })
        );
        menu.addMenuItem(
                new MenuItem("Delete photo",
                        () -> {
                    DeletePhotoFromConsole del = new DeletePhotoFromConsole(input);
                    long photoId=del.deletePhotoById();
                    photoService.deletePhoto(photoId);
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