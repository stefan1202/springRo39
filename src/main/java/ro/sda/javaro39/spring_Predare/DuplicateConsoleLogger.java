package ro.sda.javaro39.spring_Predare;

import org.springframework.stereotype.Component;
import ro.sda.javaro39.spring_Predare.FirstExerciseMain.SimpleLogger;

@Component
public class DuplicateConsoleLogger implements SimpleLogger {
    @Override
    public void printMessage(String message) {
        System.out.println("This is a complex logger! " + message);
    }
}
