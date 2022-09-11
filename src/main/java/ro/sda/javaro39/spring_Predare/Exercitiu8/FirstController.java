package ro.sda.javaro39.spring_Predare.Exercitiu8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class FirstController {
    RandomBooleanProvider randomBooleanProvider;

    public FirstController(RandomBooleanProvider randomBooleanProvider) {
        this.randomBooleanProvider = randomBooleanProvider;
    }

    @GetMapping("/random-boolean")
    public boolean getValue() {
        return randomBooleanProvider.getValue();
    }
}
