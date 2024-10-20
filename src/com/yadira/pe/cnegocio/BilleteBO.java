package com.yadira.pe.cnegocio;

import com.yadira.pe.cdatosdao.BilleteDao;
import com.yadira.pe.cmodelo.Billete;
import com.yadira.pe.db.Conexion;

import javax.swing.JTable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class BilleteBO {

    private BilleteDao billeteDao = new BilleteDao();

    public String agregarBillete(Billete billete) throws SQLException {
        try (Connection c = Conexion.getConnection()) {
            return billeteDao.agregarBillete(c, billete);
        }
    }

    public ArrayList<Billete> listarBilletes(JTable table) {
        ArrayList<Billete> lista = new ArrayList<>();
        try (Connection c = Conexion.getConnection()) {
            lista = billeteDao.listarBilletes(c);
            // Aquí puedes agregar la lógica para llenar la tabla
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lista;
    }

    public String modificarBillete(Billete billete) throws SQLException {
        try (Connection c = Conexion.getConnection()) {
            return billeteDao.modificarBillete(c, billete);
        }
    }

    public String eliminarBillete(Billete billete) throws SQLException {
        try (Connection c = Conexion.getConnection()) {
            return billeteDao.eliminarBillete(c, billete);
        }
    }
}
