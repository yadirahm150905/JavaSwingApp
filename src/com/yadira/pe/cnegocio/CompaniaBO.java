package com.yadira.pe.cnegocio;

import com.yadira.pe.cdatosdao.CompaniaDao;
import com.yadira.pe.cmodelo.Compania;
import com.yadira.pe.db.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
//NOMBRE: YADIRA YAHAIRA HUAMAN MEZA
public class CompaniaBO {

    private String mensaje;
    private CompaniaDao companiaDao = new CompaniaDao();
    
    public String agregarCompania(Compania compania) throws SQLException {
        try (Connection c = Conexion.getConnection()) {
            mensaje = companiaDao.agregarCompania(c, compania);
            c.commit();
        } catch (SQLException e) {
            mensaje = "Error al agregar compañía: " + e.getMessage();
            throw e; // Propaga la excepción
        }
        return mensaje;
    }

    public String eliminarCompania(Compania compania) throws SQLException {
        try (Connection c = Conexion.getConnection()) {
            mensaje = companiaDao.eliminarCompania(c, compania);
            c.commit();
        } catch (SQLException e) {
            mensaje = "Error al eliminar compañía: " + e.getMessage();
            throw e; // Propaga la excepción
        }
        return mensaje;
    }

    public String modificarCompania(Compania compania) throws SQLException {
        try (Connection c = Conexion.getConnection()) {
            mensaje = companiaDao.modificarCompania(c, compania);
            c.commit();
        } catch (SQLException e) {
            mensaje = "Error al modificar compañía: " + e.getMessage();
            throw e; // Propaga la excepción
        }
        return mensaje;
    }

    public void listarCompania(JTable table) {
        try (Connection c = Conexion.getConnection()) {
            companiaDao.listarCompania(c, table);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }   
      public ArrayList<Compania> listarCompaniaCombo(){
      ArrayList<Compania> listarCompaniaCombo = new ArrayList <>();
      Connection c = Conexion.getConnection();
      listarCompaniaCombo = companiaDao.listarCompaniaCombo(c);
      
      try{
          c.close();
      } catch (Exception e) {
          System.out.println("ERROR: " + e.getMessage());
      }
     return listarCompaniaCombo;
    
          
    }
}
    

