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
public class UsuarioPersona extends Usuario {

    private String rut;
    private String nombreRestaurante;

    public UsuarioPersona(String rut, String nombreRestaurante, String nombreUsuario, String contrasena, Tipo_Usuario tipoUsuario) {
        super(nombreUsuario, contrasena, tipoUsuario);
        this.rut = rut;
        this.nombreRestaurante = nombreRestaurante;
    }

    public UsuarioPersona() {
    }
    
    

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    
    
    
}
