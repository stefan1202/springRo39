package ro.sda.javaro39.spring_Predare.Exercitiu7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(path = "/api/pairs")
public class NamedPairsController {

    @RequestMapping(path = "/{name}")
    public @ResponseBody NamedPairs createNamePairs(@PathVariable(name = "name") String variableName) {
        return NamedPairs.builder()
                .firstName(variableName)
                .pairsMap(Map.of())
                .build();
    }
}
