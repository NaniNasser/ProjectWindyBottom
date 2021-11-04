package project.project2.Service;

import project.project2.tools.GardeningTool;
import project.project2.tools.Tool;

import javax.annotation.PostConstruct;

public class GardeningServiceImpl implements GardeningService {

    private GardeningTool gardeningTool;

    public GardeningServiceImpl(GardeningTool gardeningTool) {
        this.gardeningTool = gardeningTool;
    }

    @PostConstruct
    @Override
    public void garden() {
        gardeningTool.doGardeningStuff();
    }
}
