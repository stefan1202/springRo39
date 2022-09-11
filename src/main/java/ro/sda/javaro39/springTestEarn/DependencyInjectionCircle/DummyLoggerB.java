package ro.sda.javaro39.springTestEarn.DependencyInjectionCircle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyLoggerB implements CommandLineRunner {
    @Autowired
    private DummyLogerA dummyLogerA;

    public DummyLoggerB(DummyLogerA dummyLogerA) {
        this.dummyLogerA = dummyLogerA;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello from DummyLogerB");
    }
}
