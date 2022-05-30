package com.example.demo.api;

import com.example.demo.bl.TransaccionBl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private TransaccionBl transaccionBl;

    @RequestMapping(value = "/transaccion", method = RequestMethod.GET)
    public ResponseEntity<?> getResponse() {
        return transaccionBl.list();
    }
}
