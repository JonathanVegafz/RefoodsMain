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

    private String ubicacion;
    private ArrayList<Restaurante> listaRestaurantesAsociados;
    private ArrayList<Envio> historialEnviosRecibidos;

    public Fundacion(String ubicacion, ArrayList<Restaurante> listaRestaurantesAsociados, ArrayList<Envio> historialEnviosRecibidos) {
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
    
}
