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
public class Admin extends UsuarioPersona{
    Restaurante restaurante;    

    public Admin(Restaurante restaurante, String rut, String nombreRestaurante, String nombreUsuario, String contrasena, Tipo_Usuario tipoUsuario) {
        super(rut, nombreRestaurante, nombreUsuario, contrasena, tipoUsuario);
        this.restaurante = restaurante;
    }


    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
    
}
