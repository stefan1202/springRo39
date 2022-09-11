package ro.sda.javaro39.springTestEarn.Exercitiu1SDA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyLoger implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello from DummyLoger");
    }
}
