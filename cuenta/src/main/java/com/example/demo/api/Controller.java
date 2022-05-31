package com.example.demo.api;

import com.example.demo.bl.CuentaBl;
import com.example.demo.dto.Cuenta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private CuentaBl cuentaBl;

    @RequestMapping(value = "/cuenta", 
                    method = RequestMethod.GET)
    public ResponseEntity<?> getResponse() {
        return cuentaBl.list();
    }

    @RequestMapping(value = "/cuenta/{id}", 
                    method = RequestMethod.GET)
    public ResponseEntity<?> getOneResponse(@PathVariable(name="id") Integer id) {
        return cuentaBl.listById(id);
    }

    @RequestMapping(value = "/cuenta", 
                    method = RequestMethod.POST)
    public ResponseEntity<?> postRequest(@RequestBody Cuenta cuenta) {
        cuenta.setStatus(true);
        return cuentaBl.create(cuenta);
    }

    @RequestMapping(value = "/cuenta/{id}", 
                    method = RequestMethod.PUT)
    public ResponseEntity<?> putRequest(@PathVariable(name="id") Integer id, 
                                        @RequestBody Cuenta cuenta) {
        return cuentaBl.updateAmount(id, cuenta.getAmount());
    }
}
