package com.example.paquetes.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.paquetes.entity.Destino;
import com.example.paquetes.repository.DestinoRepository;
import com.example.paquetes.service.DestinoService;

@Service
public class DestinoServiceImpl implements DestinoService {

    @Autowired
    private DestinoRepository r;

    @Override
    public List<Destino> readAll() {
        return r.findAll();
    }

    @Override
    public Destino create(Destino al) {
        return r.save(al);
    }

    @Override
    public Destino read(int id) {
        return r.findById(id).get();
    }

    @Override
    public void delete(int id) {
        r.deleteById(id);
    }

    @Override
    public Destino update(Destino al) {
        return r.save(al);
    }
}