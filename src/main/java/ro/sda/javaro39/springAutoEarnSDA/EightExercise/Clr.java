package ro.sda.javaro39.springAutoEarnSDA.EightExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Clr implements CommandLineRunner {
    @Autowired
    @Qualifier("clasaA")
    private Interface anInterface;

    @Autowired
    @Qualifier("clasaB")
    private Interface anInterfaceTwo;

    @Override
    public void run(String... args) throws Exception {
        anInterface.showSalute();
        anInterfaceTwo.showSalute();
    }
}
