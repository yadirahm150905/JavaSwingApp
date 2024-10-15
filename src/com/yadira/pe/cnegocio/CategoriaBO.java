/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yadira.pe.cnegocio;

import com.yadira.pe.cdatosdao.CategoriaDao;
import com.yadira.pe.cmodelo.Categoria;
import com.yadira.pe.db.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoriaBO {
  private String mensaje;
    private CategoriaDao tdd = new CategoriaDao();

    // Cambiado el tipo de parámetro a TipoDocumento
    public String agregarCategoria(Categoria categoria) throws SQLException {
        // Usamos try-with-resources para asegurar que la conexión se cierra
        try (Connection c = Conexion.getConnection()) {
            // Iniciar la transacción
            c.setAutoCommit(false);

            try {
                mensaje = tdd.agregarCategoria(c, categoria);
                c.commit(); // Solo se llama si la inserción es exitosa
            } catch (SQLException e) {
                c.rollback(); // Revierte la transacción en caso de error
                mensaje = "Error al agregar tipo de documento: " + e.getMessage(); 
            }
        } catch (SQLException e) {
            mensaje = "Error al establecer conexión: " + e.getMessage();
        }
        
        return mensaje; 
    }

   public static String actualizarCategoria(Connection conn, Categoria categoria) throws SQLException {
        PreparedStatement ps = null;
        String mensaje = ""; // Inicializar mensaje para devolver el resultado
        String sql = "UPDATE categoria SET nombre_categoria = ?, descripcion_categoria = ?, fecha_contratacion = ? WHERE ID_CATEGORIA = ?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, categoria.getNombre_categoria()); // Establecer el nuevo nombre de la categoría
            ps.setString(2, categoria.getDescripcion_categoria()); // Establecer la nueva descripción
            ps.setString(3, categoria.getFecha_contratacion()); // Establecer la nueva fecha
            ps.setInt(4, categoria.getId_categoria()); // Establecer el ID de la categoría para actualizar

            // Ejecutar la consulta
            int filasActualizadas = ps.executeUpdate();

            if (filasActualizadas > 0) {
                mensaje = "La categoría fue actualizada correctamente.";
            } else {
                mensaje = "No se encontró la categoría con el ID proporcionado.";
            }

        } catch (SQLException e) {
            mensaje = "Error al actualizar la categoría: " + e.getMessage();
        } finally {
            // Cerrar el PreparedStatement
            if (ps != null) {
                ps.close();
            }
        }
        return mensaje;
    }
}
   
 // 


