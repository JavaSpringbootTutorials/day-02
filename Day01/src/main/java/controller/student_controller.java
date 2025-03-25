package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class student_controller {

    @GetMapping("/name")
    public String name() {
        return "My name is Nuwan";
    }

    @GetMapping("/reg")
    public String getReg() {
        return "2020ICT001";
    }

    @GetMapping("/age")
    public Integer getAge() {
        return 24;
    }
}
