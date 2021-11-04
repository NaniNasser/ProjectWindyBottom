package project.project2.Service;

import project.project2.tools.Tool;

import javax.annotation.PostConstruct;

public class CleaningServiceImpl implements CleaningService {

    private Tool tool;

    public CleaningServiceImpl(Tool tool) {
        this.tool = tool;
    }

    @PostConstruct
    @Override
    public void clean() {
        tool.doCleaningJob();
    }
}
