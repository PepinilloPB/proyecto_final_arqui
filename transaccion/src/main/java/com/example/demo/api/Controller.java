package com.example.demo.api;

import com.example.demo.bl.TransaccionBl;
import com.example.demo.dto.Transaccion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private TransaccionBl transaccionBl;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/transaccion", method = RequestMethod.GET)
    public ResponseEntity<?> getResponse() {
        return transaccionBl.list();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/transaccion", method = RequestMethod.POST)
    public ResponseEntity<?> postResponse(@RequestBody Transaccion transaccion) {
        return transaccionBl.create(transaccion);
    }
}
