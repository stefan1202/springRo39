package ro.sda.javaro39.springTestEarn.Exercitiu4SDA;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
public class Application implements CommandLineRunner {
    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        DummyLogger createDummy = (DummyLogger) applicationContext.getBean("createDummy");
        createDummy.sayHi();

        ListUtil createList = (ListUtil) applicationContext.getBean("createList");
        int sumElements = createList.sumElements(Arrays.asList(1, 2, 3, 4));
        System.out.println(sumElements);

        StringUtil createString = (StringUtil) applicationContext.getBean("createString");
        String result = createString.formSentence(List.of("Ana", "are", "mere"));
        log.info(result);
    }
}
