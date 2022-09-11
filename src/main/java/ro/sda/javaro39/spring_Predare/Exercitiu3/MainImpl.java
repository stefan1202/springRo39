package ro.sda.javaro39.spring_Predare.Exercitiu3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MainImpl implements CommandLineRunner {
    @Autowired
    DummyLogger dummyLogger;


    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();

    }
}
