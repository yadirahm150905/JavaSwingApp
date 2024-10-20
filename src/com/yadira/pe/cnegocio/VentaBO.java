package com.yadira.pe.cnegocio;

import com.yadira.pe.cdatosdao.VentaDao;
import com.yadira.pe.cmodelo.Venta;
import com.yadira.pe.db.Conexion;
import javax.swing.JTable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class VentaBO {
    private String mensaje;
    private final VentaDao ventaDao = new VentaDao();
    
    public String agregarVenta(Venta venta) {
        try (Connection c = Conexion.getConnection()) {
            mensaje = ventaDao.agregarVenta(c, venta);
            c.commit();
        } catch (SQLException e) {
            mensaje = "Error al agregar venta: " + e.getMessage();
        }
        return mensaje;
    }

    public String eliminarVenta(Venta venta) {
        try (Connection c = Conexion.getConnection()) {
            mensaje = ventaDao.eliminarVenta(c, venta);
            c.commit();
        } catch (SQLException e) {
            mensaje = "Error al eliminar venta: " + e.getMessage();
        }
        return mensaje;
    }

    public String modificarVenta(Venta venta) {
        try (Connection c = Conexion.getConnection()) {
            mensaje = ventaDao.modificarVenta(c, venta);
            c.commit();
        } catch (SQLException e) {
            mensaje = "Error al modificar venta: " + e.getMessage();
        }
        return mensaje;
    }

    public void listarVentas(JTable table) {
        try (Connection c = Conexion.getConnection()) {
            ventaDao.listarVentas(c, table);
        } catch (SQLException e) {
            System.out.println("Error al listar ventas: " + e.getMessage());
        }
    }

    
    public ArrayList<Venta> listarVentasCombo() {
        ArrayList<Venta> listaVentas = new ArrayList<>();
        try (Connection c = Conexion.getConnection()) {
            listaVentas = ventaDao.listarVentasCombo(c);
        } catch (SQLException e) {
            System.out.println("Error al listar ventas: " + e.getMessage());
        }
        return listaVentas;
    }
}
