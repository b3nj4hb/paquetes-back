package com.example.paquetes.service;

import java.util.List;

import com.example.paquetes.entity.Empleado;

public interface EmpleadoService {
    List<Empleado> readAll();

    Empleado create(Empleado al);

    Empleado read(int id);

    void delete(int id);

    Empleado update(Empleado al);
}