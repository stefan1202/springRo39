package ro.sda.javaro39.spring_Predare.Exercitiu2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DummyLogger {
  public void sayHello() {
    log.info("hello from DummyLogger");
  }
}