package com.yadira.pe.cdatosdao;

import com.yadira.pe.cmodelo.TipoDocumento;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class TipoDocumentoDao {
    private String mensaje;

    // Método para insertar tipo de documento a la DB
    public String agregarTipoDocumento(Connection conn, TipoDocumento tipoDocumento) {
        String sql = "INSERT INTO TIPO_DOCUMENTO (nombre, siglas, nacionalidad, estado, fecha) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, tipoDocumento.getNombre());
            ps.setString(2, tipoDocumento.getSiglas());
            ps.setString(3, tipoDocumento.getNacionalidad());
            ps.setString(4, tipoDocumento.getEstado());
            ps.setString(5, tipoDocumento.getFecha());
            ps.executeUpdate();
            mensaje = "El tipo de documento fue creado correctamente.";
        } catch (Exception e) {
            mensaje = "Alto! Error al crear tipo documento: " + e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje;
    }

    // Método para eliminar tipo de documento
    public String eliminarTipoDocumento(Connection conn, TipoDocumento tipoDocumento) {
        String sql = "DELETE FROM TIPO_DOCUMENTO WHERE ID_TIPO_DOCUMENTO = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, tipoDocumento.getID_TIPO_DOCUMENTO());
            ps.executeUpdate();
            mensaje = "El tipo de documento fue eliminado correctamente.";
        } catch (Exception e) {
            mensaje = "Alto! Error al eliminar tipo documento: " + e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje;
    }

    // Método para modificar tipo de documento
    public String modificartipodocumento(Connection conn, TipoDocumento tipoDocumento) {
        String sql = "UPDATE TIPO_DOCUMENTO SET siglas = ?, nacionalidad = ?, nombre = ?, estado = ?, fecha = ? WHERE ID_TIPO_DOCUMENTO = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, tipoDocumento.getSiglas());
            ps.setString(2, tipoDocumento.getNacionalidad());
            ps.setString(3, tipoDocumento.getNombre());
            ps.setString(4, tipoDocumento.getEstado());
            ps.setString(5, tipoDocumento.getFecha());
            ps.setInt(6, tipoDocumento.getID_TIPO_DOCUMENTO());
            ps.executeUpdate();
            ps.close();
                mensaje = "El tipo de documento fue modificado correctamente.";
                      
        } catch (Exception e) {
            mensaje = "Alto! Error al modificar tipo documento: " + e.getMessage();
            System.out.println(mensaje);
        }
        return mensaje;
    }
    /*
public String modificarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
        PreparedStatement ps = null;
        String sql = "UPDATE TIPO_DOCUMENTO "
                + " SET NOMBRE=?, SIGLA=?, ESTADO=?, ORDEN=?, FECHA_REGISTRO=?, FECHA_ACTUALIZA=?"
                + " WHERE ID_TIPO_DOCUMENTO=?";
        try {
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, tipoDocumento.getNombre());
            ps.setString(2, tipoDocumento.getSiglas());
            ps.setString(3, tipoDocumento.getNacionalidad());
            ps.setInt(4, tipoDocumento.getOrden());
            ps.setString(5, tipoDocumento.getFecha());
            ps.setString(6, tipoDocumento.getFechaActuliza());
            ps.setInt(7, tipoDocumento.getIdTipoDocumento());
            ps.execute();
            ps.close();
            mensaje = "El tipo documento fue actualizado corectamente";
        } catch (Exception e) {
            mensaje = "Alto! error al actualizar tipo documento. " + e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje;
    }
    */
    // Método para listar tipo de documento en JTable
   //Cuarto Metodo - Listar Tipo Documento.
    public void listarTipoDocumento(Connection conn, JTable table){
        System.out.println("aquiiii");
        DefaultTableModel model;
        Statement statement = null;
        ResultSet resultSet = null;
        
        String[] columnas = {"ID","NOMBRE","SIGLAS","NACIONALIDAD","ESTADO","FECHA"};
        model = new DefaultTableModel(null,columnas);
        
        String sql = "SELECT * FROM TIPO_DOCUMENTO";
        String[] datosTP = new String[6];
        
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                TipoDocumento td = new TipoDocumento();
                td.setID_TIPO_DOCUMENTO(resultSet.getInt("ID_TIPO_DOCUMENTO"));
                td.setNombre(resultSet.getString("NOMBRE"));
                td.setSiglas(resultSet.getString("SIGLAS"));
                td.setNacionalidad(resultSet.getString("NACIONALIDAD"));
                td.setEstado(resultSet.getString("ESTADO"));
                td.setFecha(resultSet.getString("FECHA"));
                
                datosTP[0] = td.getID_TIPO_DOCUMENTO()+"";
                datosTP[1] = td.getNombre()+"";
                datosTP[2] = td.getSiglas()+"";
                datosTP[3] = td.getNacionalidad()+"";
                datosTP[4] = td.getEstado()+"";
                datosTP[5] = td.getFecha()+"";
                model.addRow(datosTP);
            }
            table.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            System.out.println(e.getMessage());
        }
    }
}
