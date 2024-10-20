
// Nombre : YADIRA YAHAIRA HUAMAN MEZA

package com.yadira.pe.cdatosdao;

import com.yadira.pe.cmodelo.Cliente;
import com.yadira.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


//Nombre: Yadira Yahaira Human Meza
public class ClienteDao {

    private String mensaje;

    // Método para insertar cliente en la DB
    public String agregarCliente(Connection conn, Cliente cliente) {
        String sql = "INSERT INTO CLIENTES (nombre, apellido, dni, direccion, email, telefono) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getDni());
            ps.setString(4, cliente.getDireccion());
            ps.setString(5, cliente.getEmail());
            ps.setString(6, cliente.getTelefono());

            ps.executeUpdate();
            mensaje = "El cliente fue agregado correctamente.";
        } catch (Exception e) {
            mensaje = "Alto! Error al agregar cliente: " + e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje;
    }

    // Método para eliminar cliente
    public String eliminarCliente(Connection conn, Cliente cliente) {
        String sql = "DELETE FROM CLIENTES WHERE ID_CLIENTE = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, cliente.getId_cliente());
            ps.executeUpdate();
            mensaje = "El cliente fue eliminado correctamente.";
        } catch (Exception e) {
            mensaje = "Alto! Error al eliminar cliente: " + e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje;
    }

    // Método para modificar cliente
    public String modificarCliente(Connection conn, Cliente cliente) {
        String sql = "UPDATE CLIENTES SET nombre = ?, apellido = ?, dni = ?, direccion = ?, email = ?, telefono = ? WHERE ID_CLIENTE = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getDni());
            ps.setString(4, cliente.getDireccion());
            ps.setString(5, cliente.getEmail());
            ps.setString(6, cliente.getTelefono());
            ps.setInt(7, cliente.getId_cliente());

            ps.executeUpdate();
            mensaje = "El cliente fue modificado correctamente.";
        } catch (Exception e) {
            mensaje = "Alto! Error al modificar cliente: " + e.getMessage();
            System.out.println(mensaje);
        }
        return mensaje;
    }

    // Método para listar clientes en JTable
    public void listarCliente(Connection conn, JTable table) {
        DefaultTableModel model;
        Statement statement = null;
        ResultSet resultSet = null;

        String[] columnas = {"ID", "NOMBRE", "APELLIDO", "DNI", "DIRECCION", "EMAIL", "TELEFONO"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT * FROM CLIENTES";
        String[] datosTP = new String[7];

        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Cliente td = new Cliente();
                td.setId_cliente(resultSet.getInt("ID_CLIENTE"));
                td.setNombre(resultSet.getString("NOMBRE"));
                td.setApellido(resultSet.getString("APELLIDO"));
                td.setDni(resultSet.getString("DNI"));
                td.setDireccion(resultSet.getString("DIRECCION"));
                td.setEmail(resultSet.getString("EMAIL"));
                td.setTelefono(resultSet.getString("TELEFONO"));

                datosTP[0] = td.getId_cliente() + "";
                datosTP[1] = td.getNombre() + "";
                datosTP[2] = td.getApellido() + "";
                datosTP[3] = td.getDni() + "";
                datosTP[4] = td.getDireccion() + "";
                datosTP[5] = td.getEmail() + "";
                datosTP[6] = td.getTelefono() + "";

                model.addRow(datosTP);
            }
            table.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Método para listar tipos de documento en combo
    public ArrayList<TipoDocumento> listarClienteCombo(Connection conn) {
        ArrayList<TipoDocumento> listarCliente = new ArrayList<>();
        Statement statement = null;
        ResultSet resultSet = null;

        String sql = "SELECT ID_TIPO_DOCUMENTO, NOMBRE FROM TIPO_DOCUMENTO";
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                TipoDocumento td = new TipoDocumento();
                td.setID_TIPO_DOCUMENTO(resultSet.getInt("ID_TIPO_DOCUMENTO"));
                td.setNombre(resultSet.getString("NOMBRE"));
                listarCliente.add(td);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            System.out.println(e.getMessage());
        }

        return listarCliente;
    }
}
