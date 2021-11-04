package project.project2.Service;

import project.project2.tools.Tool;

import javax.annotation.PostConstruct;
import java.util.List;

public class DomesticServiceImpl implements DomesticService {


    private List<CleaningService> cleaningServices;
    private List<GardeningService> gardeningServices;

    public DomesticServiceImpl(List<CleaningService> cleaningServices, List<GardeningService> gardeningServices) {
        this.cleaningServices = cleaningServices;
        this.gardeningServices = gardeningServices;
    }

    @PostConstruct
    @Override
    public void runHouseHold() {

        System.out.println("Cleaning and gardening ");
        if (cleaningServices != null)
            cleaningServices.forEach(CleaningService::clean);


        if (gardeningServices != null)
            gardeningServices.forEach(GardeningService::garden);

    }
}
