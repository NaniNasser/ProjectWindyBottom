package project.project2.tools;

import javax.annotation.PostConstruct;

public class Swiffer implements Tool {

    @PostConstruct
    @Override
    public void doCleaningJob() {
        System.out.println(" Doing cleaning job with  Swiffer ");

    }
}
