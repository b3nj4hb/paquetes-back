package com.example.paquetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.paquetes.entity.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
}