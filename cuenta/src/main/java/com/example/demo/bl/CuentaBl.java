package com.example.demo.bl;

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
}
