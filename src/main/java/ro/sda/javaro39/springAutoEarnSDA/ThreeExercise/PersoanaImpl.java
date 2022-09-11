package ro.sda.javaro39.springAutoEarnSDA.ThreeExercise;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PersoanaImpl implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Persoana persoana = new Persoana();
        persoana.setNume("Abecedar");
        persoana.setVarsta(13);
        System.out.println(persoana);
    }
}
