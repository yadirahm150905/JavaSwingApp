package com.yadira.pe.cnegocio;

import com.yadira.pe.cdatosdao.TipoDocumentoDao;
import com.yadira.pe.cmodelo.TipoDocumento;
import com.yadira.pe.db.Conexion;
import javax.swing.JTable;
import java.sql.Connection;
import java.sql.SQLException;

public class TipoDocumentoBO {
    private String mensaje;
    TipoDocumentoDao tdd = new TipoDocumentoDao();
    
    public String agregarTipoDocumento(TipoDocumento tipoDocumento) throws SQLException {
        Connection c = Conexion.getConnection();
        try {
            mensaje = tdd.agregarTipoDocumento(c, tipoDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
            mensaje = "Error al agregar tipo de documento: " + e.getMessage();
        } finally {
            c.close();
        }
        return mensaje;
    }

    public String eliminarTipoDocumento(TipoDocumento tipoDocumento) throws SQLException {
        Connection c = Conexion.getConnection();
        try {
            mensaje = tdd.eliminarTipoDocumento(c, tipoDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
            mensaje = "Error al eliminar tipo de documento: " + e.getMessage();
        } finally {
            c.close();
        }
        return mensaje;
    }

    // MODIFICAR
    public String modificartipodocumento(TipoDocumento tipoDocumento) throws SQLException {
        Connection c = Conexion.getConnection();
        try {
            mensaje = tdd.modificartipodocumento(c, tipoDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
            mensaje = "Error al modificar tipo de documento: " + e.getMessage();
        } finally {
            c.close();
        }
        return mensaje;
    }

    // LISTAR
    public void listarTipoDocumento(JTable table){
        Connection c = Conexion.getConnection();
        tdd.listarTipoDocumento(c, table);
        try {
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }
}
