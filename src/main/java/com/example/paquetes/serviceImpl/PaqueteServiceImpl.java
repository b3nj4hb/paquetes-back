package com.example.paquetes.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.paquetes.entity.Paquete;
import com.example.paquetes.repository.PaqueteRepository;
import com.example.paquetes.service.PaqueteService;

@Service
public class PaqueteServiceImpl implements PaqueteService {

    @Autowired
    private PaqueteRepository r;

    @Override
    public List<Paquete> readAll() {
        return r.findAll();
    }

    @Override
    public Paquete create(Paquete al) {
        return r.save(al);
    }

    @Override
    public Paquete read(int id) {
        return r.findById(id).get();
    }

    @Override
    public void delete(int id) {
        r.deleteById(id);
    }

    @Override
    public Paquete update(Paquete al) {
        return r.save(al);
    }
}