package com.ds.springsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/admin")
    public String admin(){
        return "admin is logged in";
    }

    @GetMapping(value = "/user")
    public String user(){
        return "user is logged in";
    }

}
