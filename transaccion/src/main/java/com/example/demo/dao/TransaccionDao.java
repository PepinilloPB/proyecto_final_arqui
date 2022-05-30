package com.example.demo.dao;

import com.example.demo.dto.Transaccion;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaccionDao extends JpaRepository<Transaccion, Integer>{
    Page<Transaccion> findAll(org.springframework.data.domain.Pageable pageable);
}
