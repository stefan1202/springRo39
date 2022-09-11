package ro.sda.javaro39.springAutoEarnSDA.EightExercise;

import org.springframework.stereotype.Component;

@Component
public class ClasaB implements Interface {
    @Override
    public void showSalute() {
        System.out.println("Clasa B raspunde BINE TU");
    }
}
