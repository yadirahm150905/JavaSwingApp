/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yadira.pe.cmodelo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Categoria {
    private int id_categoria;
    private String nombre_categoria;
    private String descripcion_categoria;
    private Date fecha_contratacion;
/*
    public Categoria(int id_categoria, String nombre_categoria, String descripcion_categoria , ) {
        this.id_categoria = id_categoria;
        this.nombre_categoria = nombre_categoria;
        this.descripcion_categoria = descripcion_categoria;
    }
*/

    

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public String getDescripcion_categoria() {
        return descripcion_categoria;
    }

    public void setDescripcion_categoria(String descripcion_categoria) {
        this.descripcion_categoria = descripcion_categoria;
    }

    public String getFecha_contratacion() 
    {
      SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        return dateformat.format(fecha_contratacion) ;
    }

    public void setFecha_contratacion(String fecha_contratacion ) throws ParseException {
      SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");

        this.fecha_contratacion =dateformat.parse(fecha_contratacion) ;
    
    
    }

    
    
}

