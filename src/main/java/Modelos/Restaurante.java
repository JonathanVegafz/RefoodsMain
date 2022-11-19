/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;

/**
 *
 * @author jonathanvega
 */
public class Restaurante {
    
    private String nombre;
    private String ubicacion;
    private String correoElectronico;
    private String numeroTelefono;
    private int id;
    private Admin admin;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Fundacion> listaFundacionesAsociadas;
    private ArrayList<Envio> historialEnvios;

    public Restaurante(String nombre, String ubicacion, String correoElectronico, int id, Admin admin, ArrayList<Empleado> listaEmpleados, ArrayList<Fundacion> listaFundacionesAsociadas, ArrayList<Envio> historialEnvios) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.correoElectronico = correoElectronico;
        this.id = id;
        this.admin = admin;
        this.listaEmpleados = listaEmpleados;
        this.listaFundacionesAsociadas = listaFundacionesAsociadas;
        this.historialEnvios = historialEnvios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Fundacion> getListaFundacionesAsociadas() {
        return listaFundacionesAsociadas;
    }

    public void setListaFundacionesAsociadas(ArrayList<Fundacion> listaFundacionesAsociadas) {
        this.listaFundacionesAsociadas = listaFundacionesAsociadas;
    }

    public ArrayList<Envio> getHistorialEnvios() {
        return historialEnvios;
    }

    public void setHistorialEnvios(ArrayList<Envio> historialEnvios) {
        this.historialEnvios = historialEnvios;
    }
    
    
    public void crearAdmin() //Ir en el Costructor
    {
        
    }
    public void mostrarRestaurante(){
        
    }
}
