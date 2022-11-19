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

    //metodos sobre historial envio
    public void buscarEnvio() {

    }

    public void mostrarHistorialEnvio() {
        for (Envio envio : historialEnvios) {
            Metodos.mostrarDato(envio, envio.getId(), envio.getRestauranteOrigen(), envio.getFundacionDestino());
            envio.mostrarDetalles();
        }
    }

    public void eliminarEnvio(int id) {
        if (Metodos.buscarElemento(historialEnvios, (env) -> id == env.getId())) {
            historialEnvios.remove(Metodos.buscarElemento(historialEnvios, (env) -> id == env.getId()));
            System.out.println("Eliminado correctamente");
            return;
        }
        System.out.println("No se encontro envio de id " + id);
    }
    //metodos gestion  empleados
    public void buscarEmpleado(){
        
    }
    public void agregarEmpleado(Empleado empleadoNuevo) {
        //llenar datos empleado
        empleadoNuevo.setId(Metodos.crearId(listaEmpleados));
        listaEmpleados.add(empleadoNuevo);
    }

    public void eliminarEmpleado() {
        if (Metodos.buscarElemento(listaEmpleados, (emp) -> id == emp.getId())) {
            historialEnvios.remove(Metodos.buscarElemento(listaEmpleados, (emp) -> id == emp.getId()));
            System.out.println("Eliminado correctamente");
            return;
        }
        System.out.println("No se encontro empleado de id " + id);
    }

    public void modificarEmpleado(int idEmpleado) {
        if (Metodos.buscarElemento(listaEmpleados, (emp) -> emp.getId() == idEmpleado)) {
            Empleado empleadoEncontrado = Metodos.buscarElemento(listaEmpleados, (emp) -> emp.getId() == idEmpleado);
            int opc;
            //entrada validada con metodo generico
            switch (opc) {
                case 1: //modifica nombre
                    break;
                case 2: //modifica permiso                    
                    break;
            }
            return;
        }
        System.out.println("Empleado de id " + id + " no existe");
    }
    //gestionar fundaciones asociadas
    public void mostrarFundacionesAsociadas(){
        for (Fundacion fundacion : listaFundacionesAsociadas){
            Metodos.mostrarDato(fundacion, fundacion.getNombre(), fundacion.getId());
        }
    }
    public void agregarFundacionAsociada(Fundacion fundacion){
        fundacion.setId(Metodos.crearId(listaFundacionesAsociadas));
        listaFundacionesAsociadas.add(fundacion);
    }
    public void buscarFundacionAsociada(){
        
    }
    public void eliminarFundacionAsociada(int id){
        listaFundacionesAsociadas.remove(Metodos.buscarElemento(listaFundacionesAsociadas, (fund) -> id == fund.getId()));
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

}
