package com.example.paquetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.paquetes.entity.Paquete;

@Repository
public interface PaqueteRepository extends JpaRepository<Paquete, Integer> {
}