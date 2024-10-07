package com.yadira.pe.cdatosdao;

import com.yadira.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TipoDocumentoDao {

    private String mensaje;

    // Método para insertar tipo de documento
    public String agregarTipoDocumento(Connection conn, TipoDocumento tipoDocumento) {
        PreparedStatement ps = null;
        String sql = "INSERT INTO categoria (ID_CATEGORIA, NOMBRE_CATEGORIA, DESCRIPCION_CATEGORIA) VALUES (?, ?, ?)";

        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, tipoDocumento.getId_categoria()); // Establecer el ID de la categoría
            ps.setString(2, tipoDocumento.getNombre_categoria()); // Establecer el nombre
            ps.setString(3, tipoDocumento.getDescripcion_categoria()); // Establecer la descripción

            // Ejecutar la consulta
            int filasAfectadas = ps.executeUpdate(); 
            
            if (filasAfectadas > 0) {
                mensaje = "El tipo de documento fue creado correctamente.";
            } else {
                mensaje = "No se pudo crear el tipo de documento.";
            }
        } catch (SQLException e) {
            mensaje = "¡Alto! Error al crear tipo de documento: " + e.getMessage();
        } finally {
            // Cerrar el PreparedStatement
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace(); 
            }
        }
        return mensaje; 
    }
}
