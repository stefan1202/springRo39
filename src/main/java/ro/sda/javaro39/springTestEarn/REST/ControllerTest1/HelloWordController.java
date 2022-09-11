package ro.sda.javaro39.springTestEarn.REST.ControllerTest1;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWordController {
    @RequestMapping(method = RequestMethod.GET, path = "/api/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok().body("Hello");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/api/hi")
    public ResponseEntity<String> sayHi() {
        return ResponseEntity.ok().body("hi");
    }
}
