package com.example.myapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my-app")
public class MyAppController {

    @GetMapping
    public ResponseEntity<String> getTest() {
        return ResponseEntity.ok("Hello World");
    }


    @GetMapping
    public ResponseEntity<String> getTestt() {
        return ResponseEntity.ok("Hello World");

    }
}
