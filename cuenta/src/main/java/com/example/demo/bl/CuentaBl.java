package com.example.demo.bl;

import java.util.Optional;

import com.example.demo.dao.CuentaDao;
import com.example.demo.dto.Cuenta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CuentaBl {
    
    @Autowired
    private CuentaDao cuentaDao;

    public ResponseEntity<?> list(){
        Pageable pageable = PageRequest.of(0, 10);
        Page<Cuenta> cuentas = cuentaDao.findAll(pageable);
        return ResponseEntity.ok(cuentas);
    }

    public ResponseEntity<?> listById(Integer id){
        Optional<Cuenta> cuenta = cuentaDao.findById(id);
        return ResponseEntity.ok(cuenta);
    }

    public ResponseEntity<?> create(Cuenta cuenta){
        cuentaDao.save(cuenta);
        return ResponseEntity.ok(cuenta);
    }

    public ResponseEntity<?> updateAmount(Integer id, Double amount){
        Optional<Cuenta> cuenta = cuentaDao.findById(id);
        if(amount != null)
            cuenta.get().setAmount(cuenta.get().getAmount() + amount);
        cuentaDao.save(cuenta.get());
        return ResponseEntity.ok(cuenta);
    } 
}
