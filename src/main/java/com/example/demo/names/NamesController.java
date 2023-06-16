package com.example.demo.names;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/names")
public class NamesController {

    private final NamesService namesService;

    @Autowired
    public NamesController(NamesService namesService) {
        this.namesService = namesService;
    }

    @PostMapping
    public String addNames(@RequestBody Names names){
        return namesService.namesString(names);
    }
}
