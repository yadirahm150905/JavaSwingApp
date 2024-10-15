package com.yadira.pe.cdatosdao;

import com.yadira.pe.cmodelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoriaDao {
    private String mensaje;

    // Método para insertar categoría
    public String agregarCategoria(Connection conn, Categoria categoria) {
        PreparedStatement ps = null;
        String sql = "INSERT INTO categoria (ID_CATEGORIA, NOMBRE_CATEGORIA, DESCRIPCION_CATEGORIA, fecha_contratacion) VALUES (?, ?, ?, ?)";

        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, categoria.getId_categoria()); // Establecer el ID de la categoría
            ps.setString(2, categoria.getNombre_categoria()); // Establecer el nombre
            ps.setString(3, categoria.getDescripcion_categoria()); // Establecer la descripción
            ps.setString(4, categoria.getFecha_contratacion()); // Establecer la fecha

            // Ejecutar la consulta
            ps.executeUpdate(); // Cambiado a executeUpdate
            
            mensaje = "La categoría fue creada correctamente."; // Ajustado el mensaje

        } catch (SQLException e) {
            mensaje = "¡Alto! Error al crear categoría: " + e.getMessage();
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

    // Método para eliminar categoría
    public String eliminarCategoria(Connection conn, Categoria categoria) {
        PreparedStatement ps = null;
        String sql = "DELETE FROM categoria WHERE ID_CATEGORIA = ?"; // Corregido SQL

        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, categoria.getId_categoria()); // Establecer el ID de la categoría

            // Ejecutar la consulta
            int filasEliminadas = ps.executeUpdate(); // Cambiado a executeUpdate
            if (filasEliminadas > 0) {
                mensaje = "La categoría fue eliminada correctamente.";
            } else {
                mensaje = "No se encontró la categoría con el ID proporcionado.";
            }

        } catch (SQLException e) {
            mensaje = "¡Alto! Error al eliminar categoría: " + e.getMessage();
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

    // Método para actualizar categoría
    public static String actualizarModificar(Connection conn, Categoria categoria) {
        PreparedStatement ps = null;
        String mensaje = ""; // Inicializar mensaje para devolver el resultado
        String sql = "UPDATE categoria SET nombre_categoria = ?, descripcion_categoria = ?, fecha_contratacion = ? WHERE ID_CATEGORIA = ?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, categoria.getNombre_categoria()); 
            ps.setString(2, categoria.getDescripcion_categoria()); 
            ps.setString(3, categoria.getFecha_contratacion()); 
            ps.setInt(4, categoria.getId_categoria()); 
            ps.setInt(5,categoria.getId_categoria ());
            // Ejecutar la consulta
         ps.execute();

           
        } catch (SQLException e) {
            mensaje = "Error al actualizar la categoría: " + e.getMessage();
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
