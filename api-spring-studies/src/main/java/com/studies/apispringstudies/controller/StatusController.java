package com.studies.apispringstudies.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping(path = "api/status")
    public String check(){
        return "online";
    }

}

//realiza consulta de status para verificar se a aplicação esta online