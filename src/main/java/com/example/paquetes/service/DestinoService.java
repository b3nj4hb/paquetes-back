package com.example.paquetes.service;

import java.util.List;

import com.example.paquetes.entity.Destino;

public interface DestinoService {
    List<Destino> readAll();

    Destino create(Destino al);

    Destino read(int id);

    void delete(int id);

    Destino update(Destino al);
}