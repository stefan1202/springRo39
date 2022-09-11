package ro.sda.javaro39.springTestEarn.Exercitiu4SDA;

import java.util.List;

public class ListUtil {

    public int sumElements(final List<Integer> ints) {
        int sum = 0;
        for (Integer anInt : ints) {
            sum += anInt;
        }
        return sum;
    }
}