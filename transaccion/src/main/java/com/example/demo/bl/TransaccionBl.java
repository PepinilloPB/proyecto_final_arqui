package com.example.demo.bl;

import com.example.demo.dao.TransaccionDao;
import com.example.demo.dto.Transaccion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TransaccionBl {
    
    @Autowired
    private TransaccionDao transaccionDao;

    public ResponseEntity<?> list(){
        Pageable pageable = PageRequest.of(0, 10);
        Page<Transaccion> transaccion = transaccionDao.findAll(pageable);
        return ResponseEntity.ok(transaccion);
    }
}
