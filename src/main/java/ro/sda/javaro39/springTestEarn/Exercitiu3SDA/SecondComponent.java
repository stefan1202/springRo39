package ro.sda.javaro39.springTestEarn.Exercitiu3SDA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SecondComponent implements DummyLoger {

    @Override
    public void run() {
        System.out.println("Second Component a inceput sa alerge");
    }
}
