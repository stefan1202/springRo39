package ro.sda.javaro39.springAutoEarnSDA.SevenExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SimpleLoggerConsoleImpl implements CommandLineRunner {
    @Autowired
    private SimpleLoggerConsole simpleLoggerConsole;

    @Override
    public void run(String... args) throws Exception {
        simpleLoggerConsole.printMessage();
    }
}
