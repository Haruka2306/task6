package com.haruka.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public Date date() {

        Date date = new Date(LocalDateTime.now());
        return date;

    }
}
