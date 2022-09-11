package ro.sda.javaro39.springAutoEarnSDA.SecondExercise;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service // you can use@Component instead of @Service
public class TextProcessorService {

  public String processSentences(final List<String> sentences) {
    return sentences.stream()
        .filter(sentence -> !sentence.isBlank())
        .map(sentence -> sentence.substring(0, 1).toUpperCase() + sentence.substring(1, sentence.length()) + ".")
            .collect(Collectors.joining());
  }
}