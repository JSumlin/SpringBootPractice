package com.example.demo.names;

import org.springframework.stereotype.Service;

@Service
public class NamesService {

    public String namesString(Names names){
        return names.toString();
    }
}
