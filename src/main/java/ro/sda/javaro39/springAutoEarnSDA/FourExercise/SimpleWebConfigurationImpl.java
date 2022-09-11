package ro.sda.javaro39.springAutoEarnSDA.FourExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SimpleWebConfigurationImpl implements CommandLineRunner {
    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        Object objectMapper = applicationContext.getBean("objectMapper");
        System.out.println(objectMapper);
    }
}
