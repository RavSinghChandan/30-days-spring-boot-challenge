// Task 1: Create a Spring Boot application with a main method
// Task 2: Add @RestController and create a simple GET endpoint that returns "Hello, Spring Boot!"
// Task 3: Run the app using `mvn spring-boot:run` or `java -jar target/app.jar`

package com.example.day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello, Spring Boot!";
    }
}
