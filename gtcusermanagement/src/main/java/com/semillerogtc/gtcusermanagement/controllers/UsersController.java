package com.semillerogtc.gtcusermanagement.controllers;

import  org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UsersController {

    @GetMapping("/ping")
    public String ping(){
        return "Hola desde controlador usuarios";
    }
}