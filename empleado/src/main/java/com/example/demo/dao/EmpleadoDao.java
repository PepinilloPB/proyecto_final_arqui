package com.example.demo.dao;

import com.example.demo.dto.Empleado;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoDao extends JpaRepository<Empleado, Integer>{
    Page<Empleado> findAll(org.springframework.data.domain.Pageable pageable);
}
