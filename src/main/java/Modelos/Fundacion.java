/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Controladores.Metodos;
import java.util.ArrayList;

/**
 *
 * @author jonathanvega
 */
class Fundacion implements Detalles {
   
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

    public void mostrarRestaurantesAsociados() {
        for (Restaurante restaurante : listaRestaurantesAsociados) {
            System.out.println(restaurante.getNombre());
        }
    }

    public void mostrarHistorialEnviosRecibidos() {
        for (Envio envio : historialEnviosRecibidos) {
            Metodos.mostrarDato(envio, envio.getId(), envio.getRestauranteOrigen(), envio.getFundacionDestino());
            envio.mostrarDatosPrincipales();
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println(" Datos de fundacion ");
        System.out.println("Nombre : " + nombre + " Ubicacion : " + ubicacion + "ID : " + id);
        System.out.println(" Lista restaurantes asociados : ");
        for (Restaurante restaurante : listaRestaurantesAsociados){
            System.out.println(" - " + restaurante.getNombre());
        }
        System.out.println(" Historial de envios recibidos : ");
        for (Envio envio : historialEnviosRecibidos){
            envio.mostrarDatosPrincipales();
        }
    }

    @Override
    public void mostrarDatosPrincipales() {
        System.out.println(" Datos de fundacion ");
        System.out.println("Nombre : " + nombre + " Ubicacion : " + ubicacion);
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
