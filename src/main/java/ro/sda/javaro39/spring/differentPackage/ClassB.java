package ro.sda.javaro39.spring.differentPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ClassB implements CommandLineRunner {
//    @Autowired
//    private ClassA classA;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Am construit beanul ClassB");
    }
}
