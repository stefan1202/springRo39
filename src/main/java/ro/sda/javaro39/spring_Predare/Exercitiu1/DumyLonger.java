package ro.sda.javaro39.spring_Predare.Exercitiu1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DumyLonger implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Exercitiu 1 este");
    }
}
