package ro.sda.javaro39.springAutoEarnSDA.SecondExercise;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class TextProcessorServiceImpl implements CommandLineRunner {
    TextProcessorService textProcessorService;

    public TextProcessorServiceImpl(TextProcessorService textProcessorService) {
        this.textProcessorService = textProcessorService;
    }

    @Override
    public void run(String... args) throws Exception {
        String ana_are_mere = textProcessorService.processSentences(Collections.singletonList("ana are mere"));
        System.out.println(ana_are_mere);
    }
}
