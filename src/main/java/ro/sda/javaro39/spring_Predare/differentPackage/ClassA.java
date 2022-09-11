package ro.sda.javaro39.spring_Predare.differentPackage;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ClassA implements CommandLineRunner {

//    @Autowired
    private ClassB classB;

    public ClassA(ClassB classB) {
        this.classB = classB;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Am construit beanul ClassA");
    }
}
