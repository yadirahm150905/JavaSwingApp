/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yadira.pe.cmodelo;


public class Compania {
    private int id_compania;
    private String nombre;
    private String direccion;
    private String telefono;

    // Constructor con parámetros
    public Compania(int id_compania, String nombre, String direccion, String telefono) {
        this.id_compania = id_compania;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Constructor predeterminado
    public Compania() {
        // Inicialización si es necesario
    }

    // Métodos getter y setter
    public int getId_compania() {
        return id_compania;
    }

    public void setId_compania(int id_compania) {
        this.id_compania = id_compania;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
