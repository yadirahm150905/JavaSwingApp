package com.yadira.pe.cdatosdao;

import com.yadira.pe.cmodelo.Venta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JTable;

public class VentaDao {

    // Método para agregar una nueva venta
    public String agregarVenta(Connection c, Venta venta) throws SQLException {
        String query = "INSERT INTO Venta (id_cliente, id_billete, fecha_venta, hora_venta) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ps.setInt(1, venta.getId_cliente());
            ps.setInt(2, venta.getId_billete());
            ps.setDate(3, java.sql.Date.valueOf(venta.getFecha_venta())); // Usar solo fecha
            ps.setString(4, venta.getHora_venta().toString()); // Convertir hora a String
            ps.executeUpdate();
        }
        return "Venta agregada correctamente";
    }

    // Método para listar todas las ventas
    public ArrayList<Venta> listarVentas(Connection c) throws SQLException {
        ArrayList<Venta> lista = new ArrayList<>();
        String query = "SELECT * FROM Venta";
        try (PreparedStatement ps = c.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Venta venta = new Venta();
                venta.setId_venta(rs.getInt("id_venta"));
                venta.setId_cliente(rs.getInt("id_cliente"));
                venta.setId_billete(rs.getInt("id_billete"));
                venta.setFecha_venta(rs.getDate("fecha_venta").toLocalDate()); // Obtener solo la fecha
                venta.setHora_venta(LocalTime.parse(rs.getString("hora_venta"))); // Obtener la hora
                lista.add(venta);
            }
        }
        return lista;
    }

    // Método para modificar una venta existente
    public String modificarVenta(Connection c, Venta venta) throws SQLException {
        String query = "UPDATE Venta SET id_cliente = ?, id_billete = ?, fecha_venta = ?, hora_venta = ? WHERE id_venta = ?";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ps.setInt(1, venta.getId_cliente());
            ps.setInt(2, venta.getId_billete());
            ps.setDate(3, java.sql.Date.valueOf(venta.getFecha_venta())); // Usar solo fecha
            ps.setString(4, venta.getHora_venta().toString()); // Convertir hora a String
            ps.setInt(5, venta.getId_venta());
            ps.executeUpdate();
        }
        return "Venta modificada correctamente";
    }

    // Método para eliminar una venta
    public String eliminarVenta(Connection c, Venta venta) throws SQLException {
        String query = "DELETE FROM Venta WHERE id_venta = ?";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ps.setInt(1, venta.getId_venta());
            ps.executeUpdate();
        }
        return "Venta eliminada correctamente";
    }

    // Método para listar ventas en un JTable (no implementado)
    public void listarVentas(Connection c, JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); // Método no implementado
    }

    // Método para listar ventas en un combo (ejemplo)
    public ArrayList<Venta> listarVentasCombo(Connection c) throws SQLException {
        ArrayList<Venta> listaCombo = new ArrayList<>();
        String query = "SELECT id_venta, id_cliente, id_billete FROM Venta"; // Ajustar columnas según necesites
        try (PreparedStatement ps = c.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Venta venta = new Venta();
                venta.setId_venta(rs.getInt("id_venta"));
                venta.setId_cliente(rs.getInt("id_cliente"));
                venta.setId_billete(rs.getInt("id_billete"));
                listaCombo.add(venta);
            }
        }
        return listaCombo;
    }
}
