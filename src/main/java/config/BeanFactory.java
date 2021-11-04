package config;

import Service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.PostConstruct;
import java.util.List;

@Configuration
public class BeanFactory {

     List<Tool> tools;


     @Bean
    public Broom getBroom(){
         return new Broom();
     }

     @Bean
    public VacuumCleaner getVacuumCleaner(){
         return new VacuumCleaner();
     }

     @Bean
    public Swiffer getSwiffer(){
         return new Swiffer();
     }

     @Bean
     public CleaningServiceImpl broomService() {
         return new CleaningServiceImpl();
     }



}
