package org.example.modelos;

import java.time.LocalDate;

public class Vehiculo {

    //id
    Integer id;

    //marca
    String marca;

    //modelo
    LocalDate modelo;

    //kilometraje
    Double kilometraje;

    //color
    String color;

    //descripcion
    String descripcion;

    //tipo
    String tipo;

    //autonomia
    Integer autonomia;

    //capacidadCarga
    Double capacidadCarga;

    //avaluo
    Integer avaluo;

    //CONSTRUCTORES DE LA CLASE


    public Vehiculo() {
    }

    public Vehiculo(Integer id, String marca, LocalDate modelo, Double kilometraje, String color, String descripcion, String tipo, Integer autonomia, Double capacidadCarga, Integer avaluo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.color = color;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.autonomia = autonomia;
        this.capacidadCarga = capacidadCarga;
        this.avaluo = avaluo;
    }
}