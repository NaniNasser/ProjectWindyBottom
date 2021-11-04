package Service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public interface CleaningService {
    @Bean
    void clean(CleaningServiceImpl cleaningServiceImpl);
}
