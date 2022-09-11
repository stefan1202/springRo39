package ro.sda.javaro39.springTestEarn.REST.Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class EndPoint {

    @GetMapping(path = "/test")
    public List<Persoana> sendObject() {
        List<Persoana> persoanaList = new ArrayList<>();
        Persoana persoanaOne = new Persoana("Marius", 13);
        Persoana persoanaTwo = new Persoana("Gheboasa", 95);
        persoanaList.add(persoanaOne);
        persoanaList.add(persoanaTwo);
        persoanaList.forEach(System.out::println);
        return persoanaList;
    }
}
