package ro.sda.javaro39.springTestEarn.Exercitiu2SDA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineWithConstructor implements CommandLineRunner {
    private DummyLogger dummyLogger;

    public CommandLineWithConstructor(DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }

    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }
}
