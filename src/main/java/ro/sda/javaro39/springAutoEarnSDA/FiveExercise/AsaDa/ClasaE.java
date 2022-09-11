package ro.sda.javaro39.springAutoEarnSDA.FiveExercise.AsaDa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClasaE {
    @Autowired
    private ClasaA clasaA;
    @Autowired
    private ClasaB clasaB;
    @Autowired
    private ClasaC clasaC;
    @Autowired
    private ClasaD clasaD;

    @Override
    public String toString() {
        return "ClasaE{" +
                "clasaA=" + clasaA +
                ", clasaB=" + clasaB +
                ", clasaC=" + clasaC +
                ", clasaD=" + clasaD +
                '}';
    }
}
