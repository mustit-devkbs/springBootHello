package com.example.test.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @GetMapping("/test")
    public String hello() {
        return "Hello Spring Boot dev_kbs";
    }
}
