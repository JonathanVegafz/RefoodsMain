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
public class Restaurante implements Detalles {

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
    //se recorre todos los restaurantes y por cada restaurante se consiguen los empleados con esa secuencia en el nombre
    //retorna una lista de empleados con la secuencia a buscar en sus nombres
    public ArrayList<Empleado> getEmpleadosConSecuencia(String patron){
        ArrayList<Empleado> empleadosEncontrados = new ArrayList<>();
        for (Empleado empleado : listaEmpleados){
            if (empleado.getNombre().contains(patron)){
                empleadosEncontrados.add(empleado);
            }
        }
        return empleadosEncontrados;
    }
    //retorna el primero envio con mas productos, si otro envio tiene misma cantidad que el maximo no lo toma, solo el primer caso.
    public Envio buscarEnvioMasProductos(){
        Envio envioMasProductos = null;
        for (Envio envio : historialEnvios){
            if (envioMasProductos == null || envio.getCantidadProductosEnviar() > envioMasProductos.getCantidadProductosEnviar()){
                envioMasProductos = envio;
            }
        }
        return envioMasProductos;
    }

    @Override
    public void mostrarDatosPrincipales() {
        System.out.println("Datos de restaurante ");
        System.out.println("Nombre : " + nombre + "id : " + id + " Telefono : " + numeroTelefono);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Datos de restaurante ");
        System.out.println("Nombre : " + nombre + " Ubicacion : " + ubicacion + "Correo electronico : " + correoElectronico + "id : " + id + " Telefono : " + numeroTelefono);
        System.out.println(" Admin : " + admin.getNombreUsuario());
        System.out.println(" Lista empleados ");
        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado.getNombre());
        }
        System.out.println(" Lista fundaciones asociadas");
        for (Fundacion fundacion : listaFundacionesAsociadas) {
            System.out.println(fundacion.getNombre());
        }
        System.out.println(" Historial envios");
        for (Envio envio : historialEnvios) {
            envio.mostrarDatosPrincipales();
        }
    }

    public void mostrarHistorialEnvio() {
        for (Envio envio : historialEnvios) {
            Metodos.mostrarDato(envio, envio.getId(), envio.getRestauranteOrigen(), envio.getFundacionDestino());
            envio.mostrarDatosPrincipales();
        }
    }

    public void eliminarEnvio(int id) {
        if (historialEnvios.removeIf(envio -> id == envio.getId())) {
            System.out.println("Envio eliminado correctamente");
            return;
        }
        System.out.println("Envio de id " + id + " no encontrado");
    }

    //metodos gestion  empleados
    public void buscarEmpleado() {

    }

    public void agregarEmpleado(Empleado empleadoNuevo) {
        //llenar datos empleado
        empleadoNuevo.setId(Metodos.crearId(listaEmpleados));
        listaEmpleados.add(empleadoNuevo);
    }

    public void eliminarEmpleado(int id) {
        if (listaEmpleados.removeIf(emp -> id == emp.getId())) {
            System.out.println("Empleado eliminado correctamente ");
            return;
        }
        System.out.println("No se encontro empleado de id " + id);
    }

    public void modificarEmpleado(int idEmpleado) {
        if (Metodos.buscarElemento(listaEmpleados, (emp) -> emp.getId() == idEmpleado)) {
            Empleado empleadoEncontrado = Metodos.getbuscarElemento(listaEmpleados, (emp) -> emp.getId() == idEmpleado);
            int opc = 0;
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
    public void mostrarFundacionesAsociadas() {
        for (Fundacion fundacion : listaFundacionesAsociadas) {
            Metodos.mostrarDato(fundacion, fundacion.getNombre(), fundacion.getId());
        }
    }

    public void agregarFundacionAsociada(Fundacion fundacion) {
        fundacion.setId(Metodos.crearId(listaFundacionesAsociadas));
        listaFundacionesAsociadas.add(fundacion);
    }

    public void buscarFundacionAsociada() {

    }

    public void eliminarFundacionAsociada(int id) {
        if (listaFundacionesAsociadas.removeIf(fund -> id == fund.getId())) {
            System.out.println("Se elimino correctamente");
            return;
        }
        System.out.println("La fundacion de id " + id + " no existe");
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
