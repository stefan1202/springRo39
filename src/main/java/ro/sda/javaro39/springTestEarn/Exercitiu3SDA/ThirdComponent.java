package ro.sda.javaro39.springTestEarn.Exercitiu3SDA;

import org.springframework.stereotype.Component;

@Component
public class ThirdComponent implements DummyLoger {
    @Override
    public void run() {
        System.out.println("Fute zilnic BM");
    }
}
