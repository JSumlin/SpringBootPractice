package com.example.demo.names;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    public String getNames(@RequestParam String value1, @RequestParam String value2, @RequestParam String value3){
        return value1 +", " + value2 + ", " + value3;
    }
}
