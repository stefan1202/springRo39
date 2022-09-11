package ro.sda.javaro39.spring_Predare.Exercitiu6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestExercitiu implements CommandLineRunner {
    @Autowired
    Persoana persoana;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(persoana);

    }
}
