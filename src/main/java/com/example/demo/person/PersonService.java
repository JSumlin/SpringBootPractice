package com.example.demo.person;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class PersonService {

    @GetMapping
    public List allPeople(){
        return List.of(new Person("Joseph"));
    }
}
