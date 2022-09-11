package ro.sda.javaro39.springTestEarn.REST.ControllerTest1;

import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashSet;
import java.util.Set;

@RestController
@RequestMapping(path = "/api")
public class SetController {

    @ResponseBody
    @GetMapping(path = "/regele")
    public Set<String> showUniqueElement() {
        Set<String> setList = new LinkedHashSet<>();
        setList.add("Marius");
        setList.add("Marius");
        setList.add("Marius");
        setList.add("Marius");
        setList.add("Marius");
        setList.add("Marius");
        setList.add("este talentul");
        setList.add("este talentul");
        setList.add("este talentul");
        setList.add("este talentul");
        setList.add("este talentul");
        setList.add("talentul romaniei");
        return setList;
    }

    @ResponseBody
    @GetMapping(path = "/salute")
    public String showString() {
        return "Salut!";
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "/api/nothing")
    public void doNothing() {

    }
}
