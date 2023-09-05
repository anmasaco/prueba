package com.example.test.services;

import java.util.List;

import com.example.test.dto.Character;
import org.springframework.stereotype.Service;


public interface TestService {
    public List<Character> getCharacters();
}
