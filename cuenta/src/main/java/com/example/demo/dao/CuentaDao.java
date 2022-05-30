package com.example.demo.dao;

import com.example.demo.dto.Cuenta;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaDao extends JpaRepository<Cuenta, Integer>{
    Page<Cuenta> findAll(org.springframework.data.domain.Pageable pageable);
}
