package com.example.demo.bl;

import com.example.demo.dao.EmpleadoDao;
import com.example.demo.dto.Empleado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoBl {
    
    @Autowired
    private EmpleadoDao empleadoDao;

    public ResponseEntity<?> list(){
        Pageable pageable = PageRequest.of(0, 10);
        Page<Empleado> empleados = empleadoDao.findAll(pageable);
        return ResponseEntity.ok(empleados);
    }
}
