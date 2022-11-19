/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Enums.Tipo_Usuario;
import java.util.HashMap;

/**
 *
 * @author sebas
 */
class Empleado extends UsuarioPersona{

    private String nombre;
    private int id;
    private HashMap<String, Boolean> permisos;


    public Empleado(String nombre, int id, HashMap<String, Boolean> permisos, String rut, String nombreRestaurante, String nombreUsuario, String contrasena, Tipo_Usuario tipoUsuario) {
        super(rut, nombreRestaurante, nombreUsuario, contrasena, tipoUsuario);
        this.nombre = nombre;
        this.id = id;
        this.permisos = permisos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<String, Boolean> getPermisos() {
        return permisos;
    }

    public void setPermisos(HashMap<String, Boolean> permisos) {
        this.permisos = permisos;
    }
    
    
}
