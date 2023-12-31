package com.example.demo.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/person")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List allPeople(){
        return personService.allPeople();
    }

    @PostMapping
    public void printPeople(@RequestBody Person person) { personService.addNewPerson(person); }
}
