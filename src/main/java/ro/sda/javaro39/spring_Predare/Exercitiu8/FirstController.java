package ro.sda.javaro39.spring_Predare.Exercitiu8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/GET/api")
public class FirstController {
    RandomBooleanProvider randomBooleanProvider;

    public FirstController(RandomBooleanProvider randomBooleanProvider) {
        this.randomBooleanProvider = randomBooleanProvider;
    }

    @RequestMapping(path = "/getValue")
    public boolean getValue() {
        return randomBooleanProvider.getValue();
    }
}
