package com.example.paquetes.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "paquete")
public class Paquete implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpaquete;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "iddestino", referencedColumnName = "iddestino")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Destino iddestino;

    private int tipo;
    private String nombre;
    private double preciocosto;
    private double precioventa;
    private String fechainicio;
    private String fechatermino;
    private int categoria;
    private String fechaconfirmacion;
    private int cupos;
    private int vigente;
}