/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yadira.pe.db;

import java.sql.Connection;
import java.sql.DriverManager;



public class Conexion {
      private static Connection con = null;
      private static String  usuario = "INSTRUMENTO";
      private static String clave = "123456";
      private static String url ="jdbc:oracle:thin:@localhost:1521:xe";

      public static Connection getConnection(){
          try {
              //cargar el controlador JDBC
              Class.forName("oracle.jdbc.OracleDriver");

              //Establecer la conexion de la base de datos
              con = DriverManager.getConnection(url,usuario,clave);
              con.setAutoCommit(false);
              System.out.println("Yadira....");
              if(con != null){
                System.out.println("Conexion exitosa!");
              } else {
                System.out.println("Error:Conexion fallida!");
              }
              
          }catch(Exception e){   
               System.out.println("Error:" + e.getMessage());
          }return con;
      }
      

        public void closeConnection() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (Exception e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Conexion.getConnection();
         
    }
}
          
                         

