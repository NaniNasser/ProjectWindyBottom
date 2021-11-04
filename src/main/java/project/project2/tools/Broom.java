package project.project2.tools;

import javax.annotation.PostConstruct;

public class Broom implements Tool {

    @PostConstruct
    @Override
    public void doCleaningJob() {
        System.out.println("Cleaning with broom");

    }
}
