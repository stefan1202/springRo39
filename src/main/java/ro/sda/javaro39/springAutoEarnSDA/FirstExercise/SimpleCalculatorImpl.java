package ro.sda.javaro39.springAutoEarnSDA.FirstExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class SimpleCalculatorImpl implements CommandLineRunner {
    @Autowired
    SimpleCalculator simpleCalculator;

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu primul numar");
        double firstNumber = scanner.nextDouble();
        System.out.println("Introdu al doilea numar");
        double secondNumber = scanner.nextDouble();
        Double add = simpleCalculator.add(firstNumber, secondNumber);
        System.out.println(add);
    }
}
