package com.example.paquetes.service;

import java.util.List;

import com.example.paquetes.entity.Reserva;

public interface ReservaService {
    List<Reserva> readAll();

    Reserva create(Reserva al);

    Reserva read(int id);

    void delete(int id);

    Reserva update(Reserva al);
}