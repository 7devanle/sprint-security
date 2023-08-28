package com.example.sprintsecurityapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @GetMapping("/loans")
    public ResponseEntity<String> loan(){
        return new ResponseEntity<String>("Welcome to balance page", HttpStatus.OK);
    }
}
