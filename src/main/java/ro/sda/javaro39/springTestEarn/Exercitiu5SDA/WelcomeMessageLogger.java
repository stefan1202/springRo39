package ro.sda.javaro39.springTestEarn.Exercitiu5SDA;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static java.lang.Boolean.TRUE;

@Component
@Slf4j
public class WelcomeMessageLogger implements CommandLineRunner {

    private String text;
    private Boolean shouldLog;

    public WelcomeMessageLogger(@Value("GOL") final String text, @Value("true") final Boolean shouldLog) {
        this.text = text;
        this.shouldLog = shouldLog;
    }

    @Override
    public void run(String... args) throws Exception {
        boolean reply = true;
        if (TRUE.equals(shouldLog)) {
            log.info(text);
        }
    }
}