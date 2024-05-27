package snd.azriel.demo_sping_jenkins.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping
public class ControllerDemo {
    @GetMapping
    public String hello() {
        return "Hello Bro";
    }
}
