package ro.sda.javaro39.springTestEarn.Exercitiu3SDA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ThirdImpl implements CommandLineRunner {
    List<DummyLoger> dummyLogers;

    public ThirdImpl(List<DummyLoger> dummyLogers) {
        this.dummyLogers = dummyLogers;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("________________________________");
        dummyLogers.forEach(dummyLoger -> dummyLoger.run());
    }
}
