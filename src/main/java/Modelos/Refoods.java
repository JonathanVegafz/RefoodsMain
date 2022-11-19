/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Controladores.Metodos;
import Enums.Tipo_Accion;
import Enums.Tipo_Usuario;
import java.util.ArrayList;

/**
 *
 * @author jonathanvega
 */
public class Refoods extends Usuario {
    private ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();
    private ArrayList<Fundacion> fundaciones = new ArrayList<Fundacion>();
    


    public Refoods(String nombreUsuario, String contrasena, Tipo_Usuario tipoUsuario) {
        super(nombreUsuario, contrasena, tipoUsuario);
    }
    
    
    
    public ArrayList<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public ArrayList<Fundacion> getFundaciones() {
        return fundaciones;
    }

    public void setRestaurantes(ArrayList<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public void setFundaciones(ArrayList<Fundacion> fundaciones) {
        this.fundaciones = fundaciones;
    }

    public void mostrarRestaurantes() //Resivir elemento grafico
    {
        Metodos.mostrarDatos(restaurantes);
    }
    
    public void agregarRestaurante(Restaurante restaurante, Admin admin)
    {
        restaurante.setId(Metodos.crearId(restaurantes));
        restaurante.crearAdmin();
        restaurantes.add(restaurante);
        buscarRestaurante(3,Tipo_Accion.ELIMINAR);
    }
    
    public void buscarRestaurante(int id, Tipo_Accion tAccion, Restaurante ... r) //removeIF (Es un predicado)
    {
        //Restaurante restaurante = Metodos.buscarElemento(restaurantes, id); // De mas
        /*if(restaurante != null)
        {
            if(tAccion == Tipo_Accion.ELIMINAR)
            {
                restaurantes.remove(restaurante);
            }
            else
            {
                if(r.length > 0)
                    restaurantes.set(restaurantes.indexOf(restaurante), r[0]); //modifica
            }
        }*/
        
    }
    public void mostrarRestaurante(){
        for (Restaurante restaurante : restaurantes){
            restaurante.mostrarRestaurante();
            
        
        }
    }

    /*@Override
    public void cambioContrasena(String nuevaContrasena) { //Esto se debe implementar despues
        
    }

    @Override
    public void cambionNombreUsuario(String nuevoNombreUsuario) {
        
    }*/
    
    
    
}
