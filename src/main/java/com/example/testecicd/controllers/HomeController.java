package com.example.testecicd.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class HomeController {
    @GetMapping
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello World");
    }
}
