package ro.sda.javaro39.springTestEarn.Exercitiu4SDA;

import java.util.List;
import java.util.stream.Collectors;

public class StringUtil {

    public String formSentence(final List<String> words) {
        return words.stream().collect(Collectors.joining(" ", "", "."));
    }
}
