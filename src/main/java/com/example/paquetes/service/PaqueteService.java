package com.example.paquetes.service;

import java.util.List;

import com.example.paquetes.entity.Paquete;

public interface PaqueteService {
    List<Paquete> readAll();

    Paquete create(Paquete al);

    Paquete read(int id);

    void delete(int id);

    Paquete update(Paquete al);
}