package com.yadira.pe.cmodelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Venta {
    private int id_venta;
    private int id_cliente;
    private int id_billete;
    private LocalDate fecha_venta; // Fecha de la venta
    private LocalTime hora_venta;   // Hora de la venta

    // Constructor con parámetros
    public Venta(int id_venta, int id_cliente, int id_billete, LocalDate fecha_venta, LocalTime hora_venta) {
        this.id_venta = id_venta;
        this.id_cliente = id_cliente;
        this.id_billete = id_billete;
        this.fecha_venta = fecha_venta;
        this.hora_venta = hora_venta;
    }

    // Constructor predeterminado
    public Venta() {
        // Inicialización si es necesario
    }

    // Métodos getter y setter
    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_billete() {
        return id_billete;
    }

    public void setId_billete(int id_billete) {
        this.id_billete = id_billete;
    }

    public LocalDate getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(LocalDate fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public LocalTime getHora_venta() {
        return hora_venta;
    }

    public void setHora_venta(LocalTime hora_venta) {
        this.hora_venta = hora_venta;
    }
}
