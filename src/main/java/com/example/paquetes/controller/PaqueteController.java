package com.example.paquetes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.paquetes.entity.Paquete;
import com.example.paquetes.service.PaqueteService;

@RestController
@RequestMapping("/api/paquete")
public class PaqueteController {
    @Autowired
    private PaqueteService s;

    @GetMapping("/")
    public String get() {
        return "TODO OK";
    }

    // CREAR
    @PostMapping("/create")
    public ResponseEntity<Paquete> save(@RequestBody Paquete lib) {
        try {
            Paquete l = s.create(lib);
            return new ResponseEntity<>(l, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // LISTAR
    @GetMapping("/all")
    public ResponseEntity<List<Paquete>> list() {
        try {
            List<Paquete> list = new ArrayList<>();
            list = s.readAll();
            if (list.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // BUSCAR {ID}
    @GetMapping("/read/{id}")
    public ResponseEntity<Paquete> search(@PathVariable("id") int id) {
        Paquete Paquete = s.read(id);
        if (Paquete.getIdpaquete() > 0) {
            return new ResponseEntity<>(Paquete, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // ELIMINAR
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") int id) {
        try {
            s.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // ACTUALIZAR {ID}
    @PutMapping("/update/{id}")
    public ResponseEntity<Paquete> update(@RequestBody Paquete l, @PathVariable("id") int id) {
        try {
            Paquete li = s.read(id);
            if (li.getIdpaquete() > 0) {
                li.setIddestino(l.getIddestino());
                li.setNombre(l.getNombre());
                li.setPreciocosto(l.getPreciocosto());
                li.setPrecioventa(l.getPrecioventa());
                li.setFechainicio(l.getFechainicio());
                li.setFechatermino(l.getFechatermino());
                li.setCategoria(l.getCategoria());
                li.setFechaconfirmacion(l.getFechaconfirmacion());
                li.setCupos(l.getCupos());
                li.setVigente(l.getVigente());

                return new ResponseEntity<>(s.create(li), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}