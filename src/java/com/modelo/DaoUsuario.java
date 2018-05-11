
package com.modelo;

import com.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luna
 */
public class DaoUsuario extends Conexion{
    
            public List<Usuario> mostrarProveedor() throws Exception
    {
        ResultSet res;
        List<Usuario> ls = new ArrayList();
        try 
        {
            this.conectar();
            String sql="select * from usuario";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            res=pre.executeQuery();
            while(res.next())
            {
                TipoUsuario tipousu = new TipoUsuario();
                tipousu.setTipoUsuario(res.getInt("idTipoUsuario"));
                Usuario usu= new Usuario(
                res.getInt("idUsuario"),
                res.getString("correo "),
                res.getString("contrasenia"),
                res.getString("estado"),
                res.getByte("img"),tipousu);                
                ls.add(usu);
            }
        } catch (Exception e) 
        {
            throw e ;
        }
        finally
        {
            this.desconectar();
        }
        return ls;
    }
        
        public void agregarProveedor(Usuario usu) throws Exception
        {
            try {
                this.conectar();
                String sql ="insert into proveedor values(?,?,?,?,?,?)";
                PreparedStatement pre = this.getCon().prepareStatement(sql);
                pre.setInt(1, usu.getIdUsuario());
                pre.setString(2, usu.getCorreo());
                pre.setString(3, usu.getContrasenia());
                pre.setString(4, usu.getEstado());
                pre.setByte(5, usu.getImg());
                pre.setInt(6, usu.getTipoUsuario().getTipoUsuario());
                pre.executeUpdate();
            } catch (Exception e) {
                throw e;
            }finally{
                this.desconectar();
            }
        }
        
        public void modificarProveedor(Usuario usu) throws Exception
        {
            try {
                this.conectar();
                String sql="insert into proveedor values(?,?,?,?,?,?)";
                PreparedStatement pre = this.getCon().prepareStatement(sql);
                pre.setInt(1, usu.getIdUsuario());
                pre.setString(2, usu.getCorreo());
                pre.setString(3, usu.getContrasenia());
                pre.setString(4, usu.getEstado());
                pre.setByte(5, usu.getImg());
                pre.setInt(6, usu.getTipoUsuario().getTipoUsuario());
                pre.executeUpdate();
            } catch (Exception e) {
                throw e;
            }finally{
                this.desconectar();
            }
        }
        
        public void eliminarProveedor(Usuario usu) throws Exception
        {
            try {
                this.conectar();
                String sql ="delete from usuario where idUsuario=?";
                PreparedStatement pre = this.getCon().prepareStatement(sql);
                pre.setInt(1, usu.getIdUsuario());
                pre.executeUpdate();
            } catch (Exception e) {
                throw e;
            }finally{
                this.desconectar();
            }
        }
    
}
