package ro.sda.javaro39.spring_Predare.Exercitiu3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class FirstComponent implements DummyLogger{
    @Override
    public void sayHello() {
        System.out.println("First Comp");
    }
}
