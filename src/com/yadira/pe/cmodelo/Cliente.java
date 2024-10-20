
package com.yadira.pe.cmodelo;

public class Cliente {
    private int id_cliente;
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String email;
    private String telefono;

    // Constructor con parámetros
    public Cliente(int id_cliente, String nombre, String apellido, String dni, String direccion, String email, String telefono) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
    }

    // Constructor predeterminado
    public Cliente() {
        // Inicialización si es necesario
    }

    // Métodos getter y setter
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
