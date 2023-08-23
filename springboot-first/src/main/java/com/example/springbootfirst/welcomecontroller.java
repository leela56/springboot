package com.example.springbootfirst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomecontroller {
    @GetMapping("/welcome")
    public String  welcome(){
        return"Hi leela How are you Doing";
    }
}
