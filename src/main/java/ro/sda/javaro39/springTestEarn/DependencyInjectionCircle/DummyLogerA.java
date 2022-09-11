package ro.sda.javaro39.springTestEarn.DependencyInjectionCircle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyLogerA implements CommandLineRunner {
    @Autowired
    private DummyLoggerB dummyLoggerB;

    public DummyLogerA(DummyLoggerB dummyLoggerB) {
        this.dummyLoggerB = dummyLoggerB;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello");
    }
}
