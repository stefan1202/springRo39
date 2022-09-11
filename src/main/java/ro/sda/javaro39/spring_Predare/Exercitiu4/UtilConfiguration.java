package ro.sda.javaro39.spring_Predare.Exercitiu4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilConfiguration {

    @Bean("DummyLoger")
    public DummyLogger createDummyLoger(){
        return new DummyLogger();
    }

    @Bean("listUtility")
    public ListUtil createListUtil(){
        return new ListUtil();
    }

    @Bean("stringUtility")
    public StringUtil stringUtil(){
        return new StringUtil();
    }

}
