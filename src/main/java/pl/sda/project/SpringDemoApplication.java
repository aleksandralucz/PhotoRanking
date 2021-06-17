package pl.sda.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sda.project.controller.RankingController;
import pl.sda.project.service.PhotoService;


@SpringBootApplication
public class SpringDemoApplication implements CommandLineRunner {

        private final RankingController controller;


        public SpringDemoApplication(PhotoService photoService) {
                controller = new RankingController(photoService);
        }

        public static void main(String[] args) {
                SpringApplication.run(SpringDemoApplication.class, args);
        }

        @Override
        public void run(String... args) throws Exception {
                controller.start();
        }
}
