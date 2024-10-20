package com.yadira.pe.cmodelo;

import java.sql.Date;
import java.sql.Timestamp;

public class Billete {
    private int id_billete;
    private int numero_billete;
    private String origen;
    private String destino;
    private Date fecha_viaje;
    private Timestamp hora;
    private double precio;
    private int id_compania;

    // Constructor con parámetros
    public Billete(int id_billete, int numero_billete, String origen, String destino, Date fecha_viaje, Timestamp hora, double precio, int id_compania) {
        this.id_billete = id_billete;
        this.numero_billete = numero_billete;
        this.origen = origen;
        this.destino = destino;
        this.fecha_viaje = fecha_viaje;
        this.hora = hora;
        this.precio = precio;
        this.id_compania = id_compania;
    }

    // Constructor predeterminado
    public Billete() {
        // Inicialización si es necesario
    }

    // Métodos getter y setter
    public int getId_billete() {
        return id_billete;
    }

    public void setId_billete(int id_billete) {
        this.id_billete = id_billete;
    }

    public int getNumero_billete() {
        return numero_billete;
    }

    public void setNumero_billete(int numero_billete) {
        this.numero_billete = numero_billete;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha_viaje() {
        return fecha_viaje;
    }

    public void setFecha_viaje(Date fecha_viaje) {
        this.fecha_viaje = fecha_viaje;
    }

    public Timestamp getHora() {
        return hora;
    }

    public void setHora(Timestamp hora) {
        this.hora = hora;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId_compania() {
        return id_compania;
    }

    public void setId_compania(int id_compania) {
        this.id_compania = id_compania;
    }
}
