package pl.sda;
//żytkownik dodaje zdjęcie (dokładniej tylko jego metadane: rozmiar, krótki opis, nazwa pliku zdjęcia, tagi,
// ocena i aparat, jakim go zrobiono),
// system tworzyłby ranking aparatów i
// użytkowników, którzy mają zdjęcia o
// najwyższej nocie. Były by wtedy trzy encje:
// Aparaty, Użytkownicy i Zdjęcia.
// Program pozwalałby na zalogowanie userowi,
// dodawanie zdjęć, usunięcie własnych zdjęć i edycję
// istniejącego zdjęcia (tylko zmiana opisu i tagów),
// lub bez zalogowania na przeglądanie zdjęć wszystkich i
// przegląd rankingu: aparatów i użytkowników i oczywiście
// dodanie oceny do zdjęcia. Dane userów i apartów, można dodać
// poza aplikacją w workbechu.
import pl.sda.entity.Camera;
import pl.sda.entity.Photo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class PhotoRanking {
        static Scanner scanner = new Scanner(System.in);
        static EntityManagerFactory factory = Persistence.createEntityManagerFactory("photoranking");


}
