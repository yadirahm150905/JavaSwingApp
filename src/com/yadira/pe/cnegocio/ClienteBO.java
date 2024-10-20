//NOMBRE : YADIRA YAHAIRA HUAMAN MEZA

package com.yadira.pe.cnegocio;

import com.yadira.pe.cdatosdao.ClienteDao;
import com.yadira.pe.cmodelo.Cliente;
import com.yadira.pe.cmodelo.TipoDocumento;
import com.yadira.pe.db.Conexion;

import javax.swing.JTable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;



// nombre: YADIRA YAHAIRA HUAMAN MEZA

public class ClienteBO {

    private String mensaje;
    private ClienteDao clienteDao = new ClienteDao();

    public String agregarCliente(Cliente cliente) throws SQLException {
        try (Connection c = Conexion.getConnection()) {
            mensaje = clienteDao.agregarCliente(c, cliente);
            c.commit();
        } catch (SQLException e) {
            mensaje = "Error al agregar CLIENTE: " + e.getMessage();
            throw e;
        }
        return mensaje;
    }

    public String eliminarCliente(Cliente cliente) throws SQLException {
        try (Connection c = Conexion.getConnection()) {
            mensaje = clienteDao.eliminarCliente(c, cliente);
            c.commit();
        } catch (SQLException e) {
            mensaje = "Error al eliminar CLIENTE: " + e.getMessage();
            throw e;
        }
        return mensaje;
    }

    public String modificarCliente(Cliente cliente) throws SQLException {
        try (Connection c = Conexion.getConnection()) {
            mensaje = clienteDao.modificarCliente(c, cliente);
            c.commit();
        } catch (SQLException e) {
            mensaje = "Error al modificar cliente: " + e.getMessage();
            throw e;
        }
        return mensaje;
    }

    public void listarCliente(JTable table) {
        try (Connection c = Conexion.getConnection()) {
            clienteDao.listarCliente(c, table);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public ArrayList<TipoDocumento> listarClienteCombo() {
        ArrayList<TipoDocumento> listarCliente = new ArrayList<>();
        try (Connection c = Conexion.getConnection()) {
            listarCliente = clienteDao.listarClienteCombo(c);
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return listarCliente;
    }
}
