/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import com.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Luna
 */
public class ValidarUsuario extends Conexion{
    
        public int validarUsu(Usuario usu) throws Exception {
        PreparedStatement pre;
        ResultSet res;
        int nivel=0;
        try {

            this.conectar();
            String sql = "select idTipoUsuario from usuario where correo=? and contrasenia=?";
            pre = this.getCon().prepareStatement(sql);
            pre.setString(1, usu.getCorreo());
            pre.setString(2, usu.getContrasenia());
            res = pre.executeQuery();
            while(res.next())
            {
                nivel=res.getInt(1);
            }
            while(res.next())
            {
                nivel=res.getInt(2);
            }
            while(res.next())
            {
                nivel=res.getInt(3);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return nivel;
    }
        
        public static void main(String[] args) throws Exception {
        Conexion c = new Conexion();
        c.conectar();
    }
    
}
