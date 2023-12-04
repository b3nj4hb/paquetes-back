package com.example.paquetes.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

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
@Table(name = "reserva")
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idreserva;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "idpaquete", referencedColumnName = "idpaquete")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Paquete idpaquete;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "idcliente", referencedColumnName = "idcliente")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Cliente idcliente;

    private String fecha;
    private String cantidad;
    private int tipopago;
    private double totalventa;
    private double descuento;
    private double totalneto;
    private String confirmado;
    private String anulado;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "codempleado", referencedColumnName = "codempleado")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Empleado codempleado;
}