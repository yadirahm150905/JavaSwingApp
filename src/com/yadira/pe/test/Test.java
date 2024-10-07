package com.yadira.pe.test;

import com.yadira.pe.cmodelo.TipoDocumento;
import com.yadira.pe.cnegocio.TipoDocumentoBO;
import java.sql.SQLException;  // 

public class Test {
    TipoDocumentoBO tipoDocumentoBO = new TipoDocumentoBO(); 
    TipoDocumento tipoDocumento; 

    public void insertar() {
        // Inicializamos el objeto TipoDocumento con valores
        tipoDocumento = new TipoDocumento(1, "Cuerda", "Descripción de la categoría");
        tipoDocumento = new TipoDocumento(2, "Persecución", "Descripción de la categoría");
        tipoDocumento = new TipoDocumento(3, "Viento", "Descripción de la categoría");


        try {
           
            String mensaje = tipoDocumentoBO.agregarTipoDocumento(tipoDocumento);
            System.out.println(mensaje); 
        } catch (SQLException e) {
            System.out.println("Error al insertar el tipo de documento: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.insertar();
    }
}

