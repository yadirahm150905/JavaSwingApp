package com.yadira.pe.cdatosdao;

import com.yadira.pe.cmodelo.Billete;
import java.security.Timestamp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class BilleteDao {

    public String agregarBillete(Connection c, Billete billete) throws SQLException {
        String query = "INSERT INTO Billetes (numero_billete, origen, destino, fecha_viaje, hora, precio, id_compania) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ps.setInt(1, billete.getNumero_billete());
            ps.setString(2, billete.getOrigen());
            ps.setString(3, billete.getDestino());
            ps.setDate(4, java.sql.Date.valueOf(billete.getFecha_viaje().toString())); // Convertir a SQL Date
            ps.setTimestamp(5, java.sql.Timestamp.valueOf(billete.getHora().toString()));
            ps.setBigDecimal(6, java.math.BigDecimal.valueOf(billete.getPrecio())); // Cambiar a BigDecimal
            ps.setInt(7, billete.getId_compania());
            ps.executeUpdate();
        }
        return "Billete agregado correctamente";
    }

   

public ArrayList<Billete> listarBilletes(Connection c) throws SQLException {
    ArrayList<Billete> lista = new ArrayList<>();
    String query = "SELECT * FROM Billetes";
    try (PreparedStatement ps = c.prepareStatement(query);
         ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
            Billete billete = new Billete();
            billete.setId_billete(rs.getInt("id_billete"));
            billete.setNumero_billete(rs.getInt("numero_billete"));
            billete.setOrigen(rs.getString("origen"));
            billete.setDestino(rs.getString("destino"));

            // Conversión de java.sql.Date a LocalDate
            Date sqlDate = rs.getDate("fecha_viaje");
            if (sqlDate != null) {
                billete.setFecha_viaje(sqlDate.toLocalDate());
            }

            // Conversión de java.sql.Timestamp a LocalDateTime
            java.sql.Timestamp sqlTimestamp = rs.getTimestamp("hora");
            if (sqlTimestamp != null) {
                billete.setHora(sqlTimestamp.toLocalDateTime());
            }

            billete.setPrecio(rs.getBigDecimal("precio").doubleValue());
            billete.setId_compania(rs.getInt("id_compania"));
            lista.add(billete);
        }
    }
    return lista;


    }

    public String modificarBillete(Connection c, Billete billete) throws SQLException {
        String query = "UPDATE Billetes SET numero_billete = ?, origen = ?, destino = ?, fecha_viaje = ?, hora = ?, precio = ?, id_compania = ? WHERE id_billete = ?";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ps.setInt(1, billete.getNumero_billete());
            ps.setString(2, billete.getOrigen());
            ps.setString(3, billete.getDestino());
            ps.setDate(4, java.sql.Date.valueOf(billete.getFecha_viaje().toString()));
            ps.setTimestamp(5, java.sql.Timestamp.valueOf(billete.getHora().toString()));
            ps.setBigDecimal(6, java.math.BigDecimal.valueOf(billete.getPrecio())); // Cambiar a BigDecimal
            ps.setInt(7, billete.getId_compania());
            ps.setInt(8, billete.getId_billete());
            ps.executeUpdate();
        }
        return "Billete modificado correctamente";
    }

    public String eliminarBillete(Connection c, Billete billete) throws SQLException {
        String query = "DELETE FROM Billetes WHERE id_billete = ?";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ps.setInt(1, billete.getId_billete());
            ps.executeUpdate();
        }
        return "Billete eliminado correctamente";
    }
}
