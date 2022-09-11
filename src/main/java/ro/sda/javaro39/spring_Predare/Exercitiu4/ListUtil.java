package ro.sda.javaro39.spring_Predare.Exercitiu4;

import java.util.List;

public class ListUtil {

  public int sumElements(final List<Integer> ints) {
    return ints.stream().reduce(0, Integer::sum);
  }
}