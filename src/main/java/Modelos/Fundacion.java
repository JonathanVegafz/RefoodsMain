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
class Fundacion {
    private int id;
    private String nombre;
    private String ubicacion;
    private ArrayList<Restaurante> listaRestaurantesAsociados;
    private ArrayList<Envio> historialEnviosRecibidos;

    public Fundacion(int id, String nombre, String ubicacion, ArrayList<Restaurante> listaRestaurantesAsociados, ArrayList<Envio> historialEnviosRecibidos) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.listaRestaurantesAsociados = listaRestaurantesAsociados;
        this.historialEnviosRecibidos = historialEnviosRecibidos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Restaurante> getListaRestaurantesAsociados() {
        return listaRestaurantesAsociados;
    }

    public void setListaRestaurantesAsociados(ArrayList<Restaurante> listaRestaurantesAsociados) {
        this.listaRestaurantesAsociados = listaRestaurantesAsociados;
    }

    public ArrayList<Envio> getHistorialEnviosRecibidos() {
        return historialEnviosRecibidos;
    }

    public void setHistorialEnviosRecibidos(ArrayList<Envio> historialEnviosRecibidos) {
        this.historialEnviosRecibidos = historialEnviosRecibidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
