/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facturacion;

import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class ConexionMySql {
    
    Connection cn=null; //variable de tipo conexion
    String usuario = "root";
    String contraseña = "";
    String bd = "ventas";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    
    
    public Connection conectar(){ //metodo conectar
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection(cadena,usuario,contraseña);
            JOptionPane.showMessageDialog(null,"Conexion realizada con exito a la base de Datos :"+bd);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al conectarse a la base de datos : " +bd +e);
            JOptionPane.showMessageDialog(null,"El sistema Fac se cerrara, intente mas tarde");
            System.exit(0);
        }
        return cn;
    }
}

