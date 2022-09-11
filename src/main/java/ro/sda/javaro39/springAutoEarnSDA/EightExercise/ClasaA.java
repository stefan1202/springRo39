package ro.sda.javaro39.springAutoEarnSDA.EightExercise;

import org.springframework.stereotype.Component;

@Component
public class ClasaA implements Interface {
    @Override
    public void showSalute() {
        System.out.println("CLASA A SPUNE ASA CE FACI");
    }
}
