/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ilerna_academy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    static String usuario = "";
// Atributos
    private static Connection con;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/bootcamp";
    private Statement statement;
    // Constructor
    public Conexion(){
        connect();
    }
    // Funciones extra
    public void connect() {
        // Reseteamos a null la conexion a la bd
        con = null;
        try{
            Class.forName(driver);
            // Nos conectamos a la bd
            con= (Connection) DriverManager.getConnection(url, user, pass);
            
            System.err.println("Conectado");
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
            System.err.println("Error en la base de datos: "+e);
        }
    }
       
    public void IniciarSesion(String nombre){
        
        String insert = "INSERT INTO usuario VALUES (null, '"+ nombre +  "', 0)";
        this.usuario = nombre;
        
        try{
            statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
             statement.executeUpdate(insert);           
            
         
        }catch (SQLException e){  
            System.err.println("Error en la base de datos: "+e);
            
        }
    }  
    
    public ResultSet respuestas() {
        String cadena = "SELECT * FROM pregunta where cod like 1;";
        try {
            System.out.println(cadena);
            statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = statement.executeQuery(cadena);
            rs.absolute(1);
            return rs;
        } catch (SQLException ex) {
            System.out.println("FALLO");
            return null;
        }
    }
    
    public int respuestacorrecta(){
   String cadena = "SELECT respuestaCorrecta FROM opcionespreguntas where cod like 1;";
        try {
            System.out.println(cadena);
            statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = statement.executeQuery(cadena);
            rs.absolute(1);
            return rs.getInt("respuestaCorrecta");
        } catch (SQLException ex) {
            System.out.println("FALLO");
            return 0;
        }
    }
    
    public void guardarPartida(int progreso) {
        String guardar = "UPDATE usuario SET progreso = " + progreso + " WHERE nombre like '" + cuenta.nombreUsuario +  "';";
        System.out.println(guardar);
         try {
           statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
           statement.executeUpdate(guardar);
        } catch (SQLException ex) {
            System.out.println("FALLO");         
        }
    }
}
