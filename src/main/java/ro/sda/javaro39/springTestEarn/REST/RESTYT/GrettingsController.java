package ro.sda.javaro39.springTestEarn.REST.RESTYT;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/grettings")
public class GrettingsController {
    @GetMapping
    public String welcome() {
        return "Welcome on my page";
    }

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello, I'm the king I want to build a empire from programming";
    }

    @GetMapping(path = "/goodbye")
    public String goodBye() {
        return "Good bye boss";
    }
}
