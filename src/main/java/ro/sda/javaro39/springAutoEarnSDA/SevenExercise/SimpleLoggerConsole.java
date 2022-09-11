package ro.sda.javaro39.springAutoEarnSDA.SevenExercise;

import org.springframework.stereotype.Component;

@Component
public class SimpleLoggerConsole implements SimpleLogger {
    @Override
    public void printMessage() {
        System.out.println("Ce faci");
    }
}
