package com.testingspringsecurity.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Greetings")
public class GreetingsApplication {
    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from greetings API");
    }

    @GetMapping("/say-goodbye")
    public ResponseEntity<String> sayGoodbye(){
        return ResponseEntity.ok("bye2");
    }
}
