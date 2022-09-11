package ro.sda.javaro39.spring_Predare.Exercitiu7;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NamedPairs {
  private String firstName;
  Map<String, String> pairsMap;
}