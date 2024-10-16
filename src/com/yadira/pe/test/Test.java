package com.yadira.pe.test;

import com.yadira.pe.cmodelo.TipoDocumento;
import com.yadira.pe.cnegocio.TipoDocumentoBO;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JTable;

public class Test {
    TipoDocumentoBO tdbo = new TipoDocumentoBO();
    TipoDocumento td = new TipoDocumento();
    
    public void insertar () throws SQLException, ParseException{
        
    td.setID_TIPO_DOCUMENTO(1);
    td.setNombre("Documento Nacional de Identidad dos ");
    td.setEstado("4");
    td.setSiglas("DNI");
    td.setNacionalidad("peruano");
    td.setFecha("20-06-2012");
    tdbo.agregarTipoDocumento(td);
    

    
    TipoDocumento td2 = new TipoDocumento();
    td2.setID_TIPO_DOCUMENTO(2);
    td2.setNombre("Pasaportea");
    td2.setEstado("1");
    td2.setSiglas("PAS");
    td2.setNacionalidad("peruana");
    td2.setFecha("24-06-2012");

    tdbo.agregarTipoDocumento(td2);
    
    TipoDocumento td3 = new TipoDocumento();
    td3.setID_TIPO_DOCUMENTO(3);
    td3.setNombre("Carnet de Extrnajeria ");
    td3.setEstado("1");
    td3.setSiglas("C.E.");
    td3.setNacionalidad("Extrnajero");
        td3.setFecha("2005-10-09");

    tdbo.agregarTipoDocumento(td3);

    /*
    System.out.println("Tipo de documento insertado: " + td.getId_documento_identidad());
    System.out.println("Nombre insertado: " + td.getNombre());
    System.out.println("Estado insertado: " + td.getEstado());
    System.out.println("Siglas  insertadas: " + td.getSiglas());
    System.out.println("Nacionalidad insertado: " + td.getNacionalidad());
*/
    }
    public void eliminar () throws SQLException, ParseException{ 
    td.setID_TIPO_DOCUMENTO(2);   
    }
    
    public void modificar () throws SQLException, ParseException{ 
    td.setID_TIPO_DOCUMENTO(2); // ID del documento que quieres modificar
    td.setNombre(" Y");
    td.setEstado("0");
    td.setSiglas(" Mc");
    td.setNacionalidad("peruana mod");
    td.setFecha("21-06-2023 modificado");

    tdbo.modificartipodocumento(td);
    }

    public void listar() throws SQLException {
        JFrame frame = new JFrame("Lista de Tipos de Documento");
        JTable table = new JTable();
        
        // Listar los tipos de documento en el JTable
        tdbo.listarTipoDocumento(table);
 

    }
    
    
    public static void main(String[] args) throws SQLException, ParseException {
        Test t = new Test();
      t.insertar(); 
        //t.eliminar();
       //t.modificar ();
          // t.listar();
    }

}
