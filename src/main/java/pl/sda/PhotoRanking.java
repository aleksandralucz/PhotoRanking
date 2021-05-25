package pl.sda;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sda.controller.RankingController;
import pl.sda.service.PhotoService;


@SpringBootApplication
public class PhotoRanking implements CommandLineRunner {

        private final RankingController controller;

        public PhotoRanking(PhotoService photoService) {
                controller = new RankingController(photoService);
        }

        public static void main(String[] args) {
                SpringApplication.run(PhotoRanking.class, args);
        }

        @Override
        public void run(String... args) throws Exception {
                controller.start();
        }
}
