package ro.sda.javaro39.springAutoEarnSDA.FourExercise;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleWebConfiguration {

    @Bean
    public ObjectMapper objectMapper() {
        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }

    @Bean
    public Converter<Object,Object> simpleObjectConverter(){
        return new Converter<Object, Object>() {
            @Override
            public Object convert(Object o) {
                return null;
            }

            @Override
            public JavaType getInputType(TypeFactory typeFactory) {
                return null;
            }

            @Override
            public JavaType getOutputType(TypeFactory typeFactory) {
                return null;
            }
        };
    }
}
