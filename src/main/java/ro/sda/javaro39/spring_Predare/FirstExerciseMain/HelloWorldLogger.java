package ro.sda.javaro39.spring_Predare.FirstExerciseMain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldLogger implements CommandLineRunner {

  @Autowired
  @Qualifier("simpleConsoleLogger")
  private final SimpleLogger simpleLogger;


  // injecting through a constructor using an interface
  public HelloWorldLogger( final SimpleLogger simpleLogger) {
    this.simpleLogger = simpleLogger;
  }

  @Override
  public void run(final String... args) throws Exception {
    simpleLogger.printMessage("Hello from command line runner");
  }
}