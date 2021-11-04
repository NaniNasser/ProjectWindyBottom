package config;

import Service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BeanFactory {

    @Bean
    public Broom createBroom() {
        return new Broom();
    }



    @Bean
    public Swiffer swiffer() {
        return new Swiffer();
    }

    @Bean
    public VacuumCleaner createVacuumCleaner() {
        return new VacuumCleaner();
    }
}
