package com.example.test.controllers;


import com.example.test.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.example.test.dto.Character;
@RestController
@RequestMapping("/api")
public class TestController {

    private final TestService service;

    @Autowired
    public TestController(TestService service) {
        this.service = service;
    }

    @GetMapping("/list-all")
    public ResponseEntity<List<Character>> test() {
        return ResponseEntity.ok(service.getCharacters());
    }
}
