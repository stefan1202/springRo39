package ro.sda.javaro39.springAutoEarnSDA.FiveExercise.AsaDa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AfisareConsola implements CommandLineRunner {
    @Autowired
    private ClasaE clasaE;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(clasaE);
    }
}
