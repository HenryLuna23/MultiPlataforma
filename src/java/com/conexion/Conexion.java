
package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Nombre de la clase: Conexion
 * Fecha: 10-05-2018
 * Version: 1.0
 * CopyRight: ITCA-FEPADE
 * @author Henry Luna
 */
public class Conexion {

    private Connection con;

    public Conexion() {
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public void conectar() throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoempleos?user=root&password=");
            System.out.println("conexion exitosa");
        } catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void desconectar() throws Exception
    {
        try 
        {
            if (con!=null) {
                if (con.isClosed()==false) {
                    con.close();
                }
            }
        } catch (Exception e) 
        {
            throw e;
        }
    }
    
 
}
