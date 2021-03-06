package project.project2.Service;

import project.project2.tools.Tool;

import javax.annotation.PostConstruct;
import java.util.List;


public class CleaningRobot implements CleaningService {
    private List<Tool> tools;


    public CleaningRobot(List<Tool> tools) {
        this.tools = tools;
    }


    @PostConstruct
    public void clean() {

        System.out.println("Cleaning from CleaningRobot class");
        if(tools != null)
            tools.forEach(Tool::doCleaningJob);
    }

}
