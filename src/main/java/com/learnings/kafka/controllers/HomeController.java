package com.learnings.kafka.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<?> home(){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("app-version", "1.0");

        return new ResponseEntity<>(hashMap, HttpStatus.OK);
    }
}
