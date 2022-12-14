/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Controladores.Metodos;
import java.util.ArrayList;

/**
 *
 * @author sebas
 */
class Envio implements Detalles{

    private int id;
    private int cantidadProductosEnviar;
    private String aplicacionEnvio;
    private String descripcion;
    private String fundacionDestino;
    private String restauranteOrigen;
    private ArrayList<Producto> listaProductosEnviar;

    public Envio(int id, int cantidadProductosEnviar, String aplicacionEnvio, String descripcion, String fundacionDestino, String restauranteOrigen, ArrayList<Producto> listaProductosEnviar) {
        this.id = id;
        this.cantidadProductosEnviar = cantidadProductosEnviar;
        this.aplicacionEnvio = aplicacionEnvio;
        this.descripcion = descripcion;
        this.fundacionDestino = fundacionDestino;
        this.restauranteOrigen = restauranteOrigen;
        this.listaProductosEnviar = listaProductosEnviar;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println(" Datos del envio ");
        System.out.println(" ID : " + id  + " aplicacion de envio  :" + aplicacionEnvio + "Restaurante origen : " +  restauranteOrigen + " Fundacion destino : " +  fundacionDestino);
        System.out.println(" Descripcion : " + descripcion );
        System.out.println(" Lista de productos : ");
        for (Producto producto : listaProductosEnviar){
            System.out.println(" - " +producto.getNombre());
        }
    }
  
    @Override
    public void mostrarDatosPrincipales() {
        System.out.println(" Datos del envio ");
        System.out.println(" Origen : " + restauranteOrigen + " Fundacion destino : " +  fundacionDestino);
        System.out.println("Descripcion : " + descripcion);
        System.out.println(" Lista de productos : ");
        for (Producto producto : listaProductosEnviar){
            System.out.println(" - " + producto.getNombre());
        }
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadProductosEnviar() {
        return cantidadProductosEnviar;
    }

    public void setCantidadProductosEnviar(int cantidadProductosEnviar) {
        this.cantidadProductosEnviar = cantidadProductosEnviar;
    }

    public String getAplicacionEnvio() {
        return aplicacionEnvio;
    }

    public void setAplicacionEnvio(String aplicacionEnvio) {
        this.aplicacionEnvio = aplicacionEnvio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFundacionDestino() {
        return fundacionDestino;
    }

    public void setFundacionDestino(String fundacionDestino) {
        this.fundacionDestino = fundacionDestino;
    }

    public String getRestauranteOrigen() {
        return restauranteOrigen;
    }

    public void setRestauranteOrigen(String restauranteOrigen) {
        this.restauranteOrigen = restauranteOrigen;
    }

    public ArrayList<Producto> getListaProductosEnviar() {
        return listaProductosEnviar;
    }

    public void setListaProductosEnviar(ArrayList<Producto> listaProductosEnviar) {
        this.listaProductosEnviar = listaProductosEnviar;
    }

    
    
    
}
