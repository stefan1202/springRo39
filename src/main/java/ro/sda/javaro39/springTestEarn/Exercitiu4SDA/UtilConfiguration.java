package ro.sda.javaro39.springTestEarn.Exercitiu4SDA;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilConfiguration {

    @Bean
    public DummyLogger createDummy() {
        return new DummyLogger();
    }

    @Bean
    public ListUtil createList() {
        return new ListUtil();
    }

    @Bean
    public StringUtil createString() {
        return new StringUtil();
    }
}
