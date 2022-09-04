package ro.sda.javaro39.spring;

import org.springframework.stereotype.Component;

@Component
public class DuplicateConsoleLogger implements SimpleLogger{
    @Override
    public void printMessage(String message) {
        System.out.println("This is a complex logger! " + message);
    }
}
