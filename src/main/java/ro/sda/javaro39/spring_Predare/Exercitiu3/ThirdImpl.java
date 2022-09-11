package ro.sda.javaro39.spring_Predare.Exercitiu3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ThirdImpl implements CommandLineRunner {
    List<DummyLogger> dummyLoggerList;

    public ThirdImpl(List<DummyLogger> dummyLoggerList) {
        this.dummyLoggerList = dummyLoggerList;
    }

    @Override
    public void run(String... args) throws Exception {
            dummyLoggerList.forEach(dummyLogger -> dummyLogger.sayHello());
    }
}
