package com.dharani.demo01.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dharani.demo01.pojo.Greeting;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final Greeting greeting;

    public GreetingController(Greeting greeting) {
        this.greeting = greeting;
    }

    @GetMapping
    public String getGreeting() {
        return greeting.getName();
    }

    @GetMapping("/coffee")
    public String getNameAndCoffee() {
        return greeting.getCoffee();
    }
    
    

}
