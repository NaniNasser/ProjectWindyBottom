package project.project2;

import Service.CleaningRobot;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    private BeanFactory context;
    CleaningRobot cl1 = context.getBean(CleaningRobot.class);
}
