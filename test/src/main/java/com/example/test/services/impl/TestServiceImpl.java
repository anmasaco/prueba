package com.example.test.services.impl;



import com.example.test.dto.Character;
import com.example.test.services.TestService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public List<Character> getCharacters() {
        List<Character> listCharacters = new ArrayList<>();
        listCharacters.add(new Character(1, "Rick Sanchez","Alive","Human","","Male","https://rickandmortyapi.com/api/location/1","https://rickandmortyapi.com/api/character/avatar/1.jpeg"));
        listCharacters.add(new Character(2, "Morty Smith","Alive","Human","","Male","","https://rickandmortyapi.com/api/character/avatar/2.jpeg"));
        listCharacters.add(new Character(3, "Summer Smith","Alive","Human","","Female","https://rickandmortyapi.com/api/location/20","https://rickandmortyapi.com/api/character/avatar/3.jpeg"));
        listCharacters.add(new Character(4, "Beth Smith","Alive","Human","","Female","https://rickandmortyapi.com/api/location/20","https://rickandmortyapi.com/api/character/avatar/4.jpeg"));
        listCharacters.add(new Character(5, "Jerry Smith","Alive","Human","","Male","https://rickandmortyapi.com/api/location/20","https://rickandmortyapi.com/api/character/avatar/5.jpeg"));
        listCharacters.add(new Character(6, "Abadango Cluster Princess","Alive","Alien","","Female","https://rickandmortyapi.com/api/location/2","https://rickandmortyapi.com/api/character/avatar/6.jpeg"));
        listCharacters.add(new Character(7, "Abradolf Lincler","unknown","Human","Genetic experiment","Male","https://rickandmortyapi.com/api/location/20","https://rickandmortyapi.com/api/character/avatar/7.jpeg"));
        listCharacters.add(new Character(8, "Adjudicator Rick","Dead","Human","","Male","","https://rickandmortyapi.com/api/character/avatar/8.jpeg"));
        listCharacters.add(new Character(9, "Agency Director","Dead","Human","","Male","https://rickandmortyapi.com/api/location/20","https://rickandmortyapi.com/api/character/avatar/9.jpeg"));
        listCharacters.add(new Character(10, "Alan Rails","Dead","Human","Superhuman (Ghost trains summoner)","Male","","https://rickandmortyapi.com/api/character/avatar/10.jpeg"));
        listCharacters.add(new Character(11, "Albert Einstein","Dead","Human","","Male","https://rickandmortyapi.com/api/location/1","https://rickandmortyapi.com/api/character/avatar/11.jpeg"));
        listCharacters.add(new Character(12, "Alexander","Dead","Human","","Male","https://rickandmortyapi.com/api/location/1","https://rickandmortyapi.com/api/character/avatar/12.jpeg"));
        listCharacters.add(new Character(13, "Alien Googah","unknown","Alien","","unknown","","https://rickandmortyapi.com/api/character/avatar/13.jpeg"));
        listCharacters.add(new Character(14, "Alien Morty","unknown","Alien","","Male","","https://rickandmortyapi.com/api/character/avatar/14.jpeg"));
        listCharacters.add(new Character(15, "Alien Rick","unknown","Alien","","Male","","https://rickandmortyapi.com/api/character/avatar/15.jpeg"));
        listCharacters.add(new Character(16, "Amish Cyborg","Dead","Alien","Parasite","Male","","https://rickandmortyapi.com/api/character/avatar/16.jpeg"));
        listCharacters.add(new Character(17, "Annie","Alive","Human","","Female","https://rickandmortyapi.com/api/location/1","https://rickandmortyapi.com/api/character/avatar/17.jpeg"));
        listCharacters.add(new Character(18, "Antenna Morty","Alive","Human","Human with antennae","Male","","https://rickandmortyapi.com/api/character/avatar/18.jpeg"));
        listCharacters.add(new Character(19, "Antenna Rick","unknown","Human","Human with antennae","Male","","https://rickandmortyapi.com/api/character/avatar/19.jpeg"));
        listCharacters.add(new Character(20, "Ants in my Eyes Johnson","unknown","Human","Human with ants in his eyes","Male","","https://rickandmortyapi.com/api/character/avatar/20.jpeg"));
        return listCharacters;
    }
}
