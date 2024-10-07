package com.yadira.pe.cnegocio;

import com.yadira.pe.cdatosdao.TipoDocumentoDao;
import com.yadira.pe.cmodelo.TipoDocumento;
import com.yadira.pe.db.Conexion;

import java.sql.Connection;
import java.sql.SQLException;

public class TipoDocumentoBO {

    private String mensaje;
    private TipoDocumentoDao tdd = new TipoDocumentoDao();

    // Cambiado el tipo de parámetro a TipoDocumento
    public String agregarTipoDocumento(TipoDocumento  tipoDocumento) throws SQLException {
        // Usamos try-with-resources para asegurar que la conexión se cierra
        try (Connection c = Conexion.getConnection()) {
            // Iniciar la transacción
            c.setAutoCommit(false);

            try {
                mensaje = tdd.agregarTipoDocumento(c, tipoDocumento);
                c.commit(); // Solo se llama si la inserción es exitosa
            } catch (SQLException e) {
                c.rollback(); // Revierte la transacción en caso de error
                mensaje = "Error al agregar tipo de documento: " + e.getMessage(); // Manejo de error específico
            }
        } catch (SQLException e) {
            mensaje = "Error al establecer conexión: " + e.getMessage(); // Manejo de error de conexión
        }
        
        return mensaje; // Retornar el mensaje final
    }
}
