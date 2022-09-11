package ro.sda.javaro39.springTestEarn.Exercitiu3SDA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class FirstComponent implements DummyLoger {

    @Override
    public void run() {
        System.out.println("DummyLoger a inceput sa alerga, este principala componenta");
    }
}
