/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yadira.pe.cdatosdao;


import com.yadira.pe.cmodelo.Compania;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CompaniaDao {

    private String mensaje;

    // Método para insertar compañía en la DB
    public String agregarCompania(Connection conn, Compania compania) {
        String sql = "INSERT INTO Compania (nombre, direccion, telefono) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, compania.getNombre());
            ps.setString(2, compania.getDireccion());
            ps.setString(3, compania.getTelefono());

            ps.executeUpdate();
            mensaje = "La compañía fue agregada correctamente.";
        } catch (Exception e) {
            mensaje = "Error al agregar compañía: " + e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje;
    }

    // Método para eliminar compañía
    public String eliminarCompania(Connection conn, Compania compania) {
        String sql = "DELETE FROM Compania WHERE id_compania = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, compania.getId_compania());
            ps.executeUpdate();
            mensaje = "La compañía fue eliminada correctamente.";
        } catch (Exception e) {
            mensaje = "Error al eliminar compañía: " + e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje;
    }

    // Método para modificar compañía
    public String modificarCompania(Connection conn, Compania compania) {
        String sql = "UPDATE Compania SET nombre = ?, direccion = ?, telefono = ? WHERE id_compania = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, compania.getNombre());
            ps.setString(2, compania.getDireccion());
            ps.setString(3, compania.getTelefono());
            ps.setInt(4, compania.getId_compania());

            ps.executeUpdate();
            mensaje = "La compañía fue modificada correctamente.";
        } catch (Exception e) {
            mensaje = "Error al modificar compañía: " + e.getMessage();
            System.out.println(mensaje);
        }
        return mensaje;
    }

    // Método para listar compañías en JTable
    public void listarCompania(Connection conn, JTable table) {
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "NOMBRE", "DIRECCION", "TELEFONO"}, 0);
        String sql = "SELECT * FROM Compania";

        try (Statement statement = conn.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Compania compania = new Compania();
                compania.setId_compania(resultSet.getInt("ID_COMPANIA"));
                compania.setNombre(resultSet.getString("NOMBRE"));
                compania.setDireccion(resultSet.getString("DIRECCION"));
                compania.setTelefono(resultSet.getString("TELEFONO"));

                model.addRow(new Object[]{
                    compania.getId_compania(),
                    compania.getNombre(),
                    compania.getDireccion(),
                    compania.getTelefono()
                });
            }
            table.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace(); // Imprimir el stack trace para más detalles
        }
    }
    public ArrayList<Compania> listarCompaniaCombo(Connection conn) {
    ArrayList<Compania> listarCompania = new ArrayList<>();
    
    Statement statement = null;
    ResultSet resultSet = null;
    
    String sql = "SELECT id_compania, NOMBRE FROM CLIENTES"; // Correct SQL for fetching data
    try {
        statement = conn.createStatement();
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            Compania td = new Compania();
            td.setId_compania(resultSet.getInt("ID_TIPid_compania"));
            td.setNombre(resultSet.getString("NOMBRE"));
            
            listarCompania.add(td);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        System.out.println(e.getMessage());
}
    
    return listarCompania;
}

}