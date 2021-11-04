package project.project2.tools;

import javax.annotation.PostConstruct;

public class LawnMower implements GardeningTool{
    @PostConstruct
    @Override
    public void doGardeningStuff() {
        System.out.println(" Doing gardening with lawnmower ");

    }

}
