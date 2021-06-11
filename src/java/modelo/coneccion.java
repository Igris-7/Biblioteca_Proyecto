/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class coneccion {
    public static Connection conectar() { 
      try{
         Class.forName("com.mysql.jdbc.Driver");
         String login="root";
         String pass="";
         String url="jdbc:mysql://localhost:3306/Discovery";
         Connection conn=DriverManager.getConnection(url, login, pass);
         return conn;
      }catch(ClassNotFoundException | SQLException ex){
         System.out.println("Problemas de conexion con la Base de Datos...");
         return null;
      } 
   }
}
