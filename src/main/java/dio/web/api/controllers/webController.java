package dio.web.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class webController {

    public String welcome() {
        return "Hello World, for my fisrt DIO web app";
    }
}
