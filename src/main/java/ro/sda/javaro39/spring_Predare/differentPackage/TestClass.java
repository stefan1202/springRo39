package ro.sda.javaro39.spring_Predare.differentPackage;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestClass implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("This is an object for " + TestClass.class);
    }
}
