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
class Envio {

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
    public void mostrarDetalles(){
        //atributos mostrar
        //System.out.println("ID : "+ id + " Cantidad productos : "+cantidadProductosEnviar+" app envio : " + aplicacionEnvio+" Fundacion destino: " + fundacionDestino + "Restaurante origen: "+restauranteOrigen);
        //System.out.println("Descripcion : " + descripcion);
        System.out.println("Productos cargados  : ");
        for(Producto producto : listaProductosEnviar){
            Metodos.mostrarDato(producto, producto.getNombre());
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
