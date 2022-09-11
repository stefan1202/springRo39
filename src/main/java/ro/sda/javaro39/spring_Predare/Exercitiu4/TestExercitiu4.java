package ro.sda.javaro39.spring_Predare.Exercitiu4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestExercitiu4 implements CommandLineRunner {
    @Autowired
    ApplicationContext applicationContext;
    @Override
    public void run(String... args) throws Exception {
        DummyLogger dummyLogger = (DummyLogger) applicationContext.getBean("DummyLogger");
        dummyLogger.sayHi();

        ListUtil listUtility = (ListUtil) applicationContext.getBean("listUtility");
        listUtility.sumElements(List.of(1,2,3));

        StringUtil stringUtility = (StringUtil) applicationContext.getBean("stringUtility");
        stringUtility.formSentence(List.of("Ana","are"));


    }
}
