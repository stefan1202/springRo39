package ro.sda.javaro39.spring_Predare.Exercitiu2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithSetterInjection implements CommandLineRunner {

    private DummyLogger dummyLogger;

    public CommandLineRunnerWithSetterInjection(DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }

    @Autowired
    public void setDummyLogger(final DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }

    @Override
    public void run(final String... args) throws Exception {
        dummyLogger.sayHello();
    }
}