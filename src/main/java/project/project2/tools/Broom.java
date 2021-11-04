package project.project2.tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.DefaultMessageSourceResolvable;

import javax.annotation.PostConstruct;
import java.util.Locale;

public class Broom implements Tool {

    @Autowired
    MessageSource messageSource;

    @PostConstruct
    @Override
    public void doCleaningJob() {
        System.out.println(
                messageSource.getMessage(
                        new DefaultMessageSourceResolvable("clean.sweep"),
                        Locale.getDefault()
                ));
    }
}
