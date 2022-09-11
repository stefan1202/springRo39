package ro.sda.javaro39.springTestEarn.Exercitiu3SDA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FirstImpl implements CommandLineRunner {
    @Autowired
    DummyLoger dummyLoger;

    @Override
    public void run(String... args) throws Exception {
        dummyLoger.run();
    }
}
