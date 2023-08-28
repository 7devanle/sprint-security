package com.example.sprintsecurityapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/accounts")
    public ResponseEntity<String> accountsControllers(){
        return new ResponseEntity<String>("Welcome to accant page", HttpStatus.OK);
    }
}
