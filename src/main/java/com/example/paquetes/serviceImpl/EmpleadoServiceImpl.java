package com.example.paquetes.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.paquetes.entity.Empleado;
import com.example.paquetes.repository.EmpleadoRepository;
import com.example.paquetes.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository r;

    @Override
    public List<Empleado> readAll() {
        return r.findAll();
    }

    @Override
    public Empleado create(Empleado al) {
        return r.save(al);
    }

    @Override
    public Empleado read(int id) {
        return r.findById(id).get();
    }

    @Override
    public void delete(int id) {
        r.deleteById(id);
    }

    @Override
    public Empleado update(Empleado al) {
        return r.save(al);
    }
}