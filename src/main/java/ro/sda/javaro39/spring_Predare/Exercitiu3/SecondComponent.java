package ro.sda.javaro39.spring_Predare.Exercitiu3;

import org.springframework.stereotype.Component;

@Component
public class SecondComponent implements DummyLogger {
    @Override
    public void sayHello() {
        System.out.println("Second component");
    }
}
