package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    /* 
    * NOTE: When a variable is declared with the final keyword, its value
    * can’t be modified, essentially, a constant. This also means that
    * you must initialize a final variable. 
    */
    private static final String text = "Hello";
    private static String template = "";
    private final AtomicLong counter = new AtomicLong();

    /* 
     * @GetMapping annotation:
     * Ensures that HTTP GET requests to /hello are mapped to the 
     * greeting() method.
     */
     @GetMapping("/hello")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "there") String name){
            template = text + "," + " " + name + "!!";
            return new Greeting(counter.incrementAndGet(), template);
    }

    @GetMapping("/")
    public String home(){
        return(
            "<h1>spring-boot RESTful web service</h1>" +
            "<p>You can salut yourself by using the following URL structure:</p>" +
            "https://localhost:8080/hello?name=<strong>YOUR_NAME</strong>"
        );
    }
}
