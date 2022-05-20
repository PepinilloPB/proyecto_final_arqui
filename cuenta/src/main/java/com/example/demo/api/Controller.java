package com.example.demo.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @RequestMapping(value = "/cuenta", method = RequestMethod.GET)
    public ResponseEntity<String> getResponse() {
        return new ResponseEntity<>("cuenta", HttpStatus.OK);
    }
}