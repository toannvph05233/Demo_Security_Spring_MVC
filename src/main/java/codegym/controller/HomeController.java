package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "home";

    }

    @GetMapping("/admin")
    public String toan() {
        return "admin";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }

}
