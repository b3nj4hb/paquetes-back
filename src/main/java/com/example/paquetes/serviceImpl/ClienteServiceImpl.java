package com.example.paquetes.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.paquetes.entity.Cliente;
import com.example.paquetes.repository.ClienteRepository;
import com.example.paquetes.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository r;

    @Override
    public List<Cliente> readAll() {
        return r.findAll();
    }

    @Override
    public Cliente create(Cliente al) {
        return r.save(al);
    }

    @Override
    public Cliente read(int id) {
        return r.findById(id).get();
    }

    @Override
    public void delete(int id) {
        r.deleteById(id);
    }

    @Override
    public Cliente update(Cliente al) {
        return r.save(al);
    }
}