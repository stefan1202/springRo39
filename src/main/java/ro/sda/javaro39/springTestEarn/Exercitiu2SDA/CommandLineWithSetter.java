package ro.sda.javaro39.springTestEarn.Exercitiu2SDA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineWithSetter implements CommandLineRunner {
    private DummyLogger dummyLogger;

    @Autowired
    public void setDummyLogger(final DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }

    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }
}
