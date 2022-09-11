package ro.sda.javaro39.springTestEarn.Exercitiu3SDA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SecondImpl implements CommandLineRunner {
    @Autowired
    @Qualifier("secondComponent")
    DummyLoger dummyLoger;

    @Override
    public void run(String... args) throws Exception {
        dummyLoger.run();
    }
}
