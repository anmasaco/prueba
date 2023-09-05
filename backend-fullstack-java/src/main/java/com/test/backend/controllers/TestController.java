package com.test.backend.controllers;

import com.test.backend.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    TestService service;
    @GetMapping("/list-all")
    public ResponseEntity<List<Character>> test() {
        return ResponseEntity.ok(service.getCharacters());
    }
}
