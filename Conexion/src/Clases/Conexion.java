/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import com.mysql.jdbc.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author CUC
 */



public class Conexion {
    private Connection conn;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/pregistro";
    
    public Conexion() {
        conn=null;
        try{
            Class.forName(driver);
            conn=(Connection)DriverManager.getConnection(url,user,pass);
            if(conn!=null){
                System.out.println("Conexion exitosa");
            }
        } catch (Exception ex) {
            System.out.println("Error de conexion "+ex);
        }
    }
    
    public Connection getConexion(){
        return conn;
    }
    
    public void desconectar(){
        conn=null;
        if(conn==null){
            System.out.println("Sesion terminada");
        }
    }
    
}
