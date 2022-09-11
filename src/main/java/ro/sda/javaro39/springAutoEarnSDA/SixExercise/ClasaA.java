package ro.sda.javaro39.springAutoEarnSDA.SixExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClasaA {
    @Autowired
    private ClasaB clasaB;
}
