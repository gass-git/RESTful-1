package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    
    private static String text = "Hello";
    private static String template = "";
    private AtomicLong counter = new AtomicLong();

   @GetMapping("/greeting")
    public Greeting greeting(
        @RequestParam(value = "name", defaultValue = "there!") String name
        ){
        template = text + "," + " " + name + "!";
        return new Greeting(counter.incrementAndGet(), template);
    }
}
