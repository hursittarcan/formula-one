package be.trcn.formulaone.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hursit")
public class GreetingController {

    @GetMapping("/hello")
    public String doGreeting() {
        return "Hallo hursit";
    }
}
