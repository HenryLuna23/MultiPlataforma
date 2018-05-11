
package com.modelo;

/**
 * Nombre de la clase: TipoUsuario
 * Fecha: 10-05-2018
 * Version: 1.0
 * CopyRight: ITCA-FEPADE
 * @author Henry Luna
 */
public class TipoUsuario {
    
    private int tipoUsuario;
    private String nombre;

    public TipoUsuario(int tipoUsuario, String nombre) {
        this.tipoUsuario = tipoUsuario;
        this.nombre = nombre;
    }

    public TipoUsuario() {
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
