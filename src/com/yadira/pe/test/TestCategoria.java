
package com.yadira.pe.test;

import com.yadira.pe.cmodelo.Categoria;
import com.yadira.pe.cnegocio.CategoriaBO;
import java.sql.SQLException;
import java.text.ParseException;

public class TestCategoria {
    private CategoriaBO categoriaBO = new CategoriaBO(); 
    private Categoria categoria;

    public void insertar() throws ParseException {
        try {
            // Creamos e insertamos las categorías una por una
            categoria = new Categoria();
            categoria.setId_categoria(20);
            categoria.setNombre_categoria("Vienuto");
            categoria.setDescripcion_categoria("Descuripción 1");
            categoria.setFecha_contratacion("15-03-2007"); 
            
            String mensaje1 = categoriaBO.agregarCategoria(categoria);
            System.out.println(mensaje1); 

        } catch (SQLException e) {
            System.out.println("Error al insertar la categoría: " + e.getMessage());
        }
}
        public void modificar() throws ParseException {
        try {
            // Creamos e insertamos las categorías una por una
            categoria = new Categoria();
            categoria.setId_categoria(7);
            categoria.setNombre_categoria("o");
            categoria.setDescripcion_categoria("Descuripción 1");
            categoria.setFecha_contratacion("15-03-2007"); 
            
            String mensaje1 = categoriaBO.agregarCategoria(categoria);
            System.out.println(mensaje1); 

        } catch (SQLException e) {
            System.out.println("Error al insertar la categoría: " + e.getMessage());
        }
    }
    
    
    public static void main(String[] args) throws ParseException {
        TestCategoria test = new TestCategoria();
        test.modificar(); // Primero insertamos la categoría
    }
}

