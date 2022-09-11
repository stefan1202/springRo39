package ro.sda.javaro39.springTestEarn.Exercitiu2SDA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineWithField implements CommandLineRunner {
    @Autowired
    private final DummyLogger dummyLogger;

    public CommandLineWithField(final DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }

    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }
}
