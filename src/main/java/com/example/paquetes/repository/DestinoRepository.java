package com.example.paquetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.paquetes.entity.Destino;

@Repository
public interface DestinoRepository extends JpaRepository<Destino, Integer> {
}