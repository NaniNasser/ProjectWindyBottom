package project.project2.config;

import project.project2.Service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import project.project2.tools.*;

import java.util.List;

@Configuration
public class BeanFactory {

     List<Tool> tools;


     @Bean
    public Tool getBroom(){
         return new Broom();
     }

     @Bean
    public Tool getVacuumCleaner(){
         return new VacuumCleaner();
     }

     @Bean
    public Tool getSwiffer(){
         return new Swiffer();
     }



     @Bean
     public CleaningService broomService() {
         return new CleaningServiceImpl(getBroom());
     }

    @Bean
    public CleaningService swifferService() {
        return new CleaningServiceImpl(getSwiffer());
    }

    @Bean
    public CleaningService vacuumService() {
        return new CleaningServiceImpl(getVacuumCleaner());
    }

    @Bean
    public CleaningService cleaningRobot(){
        return new CleaningRobot(List.of(
                getBroom(),
                getSwiffer(),
                getVacuumCleaner()));
    }

    @Bean
    public GardeningTool lawnMower(){
         return new LawnMower();
    }

    @Bean
    public GardeningTool spade(){
        return new Spade();
    }

    @Bean
    public GardeningTool rake(){
        return new Rake();
    }

    @Bean
    public GardeningService lawnMowerService(){
         return new GardeningServiceImpl(lawnMower());
    }

    @Bean
    public GardeningService rakeService(){
        return new GardeningServiceImpl(rake());
    }

    @Bean
    public GardeningService spadeService(){
        return new GardeningServiceImpl(spade());
    }

    @Bean
    public DomesticService domesticService(){
         return  new DomesticServiceImpl(List.of(broomService(),swifferService(),vacuumService()), List.of(lawnMowerService(),rakeService(),spadeService()));
    }


}
