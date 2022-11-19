/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Enums.Tipo_Usuario;


/**
 *
 * @author jonathanvega
 */
public /*abstract*/ class Usuario {
    protected String nombreUsuario;
    protected String contrasena;
    protected Tipo_Usuario tipoUsuario;

    public Usuario(String nombreUsuario, String contrasena, Tipo_Usuario tipoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.tipoUsuario = tipoUsuario;
    }
    
    ///public abstract void cambioContrasena(String nuevaContrasena);
    //public abstract void cambionNombreUsuario(String nuevoNombreUsuario);

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public Tipo_Usuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setTipoUsuario(Tipo_Usuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
    
}
            