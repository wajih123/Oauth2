package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloRessource {

    @GetMapping("/rest/hello")
    public String hello(){
        return "Hello World" ;
    }
}
