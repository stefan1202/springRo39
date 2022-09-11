package ro.sda.javaro39.springAutoEarnSDA.FirstExercise;

import org.springframework.stereotype.Service;

@Service
public class SimpleCalculator {

  public Double add(Double valA, Double valB) {
    return valA +valB;
  }
}