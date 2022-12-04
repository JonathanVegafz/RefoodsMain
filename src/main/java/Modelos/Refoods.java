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

    @Override
    public void mostrarDatos() {
        System.out.println("Restaurantes en Refoods ( " + restaurantes.size() + " )");
        for (Restaurante restaurante : restaurantes) {
            restaurante.mostrarDatos();
        }
        System.out.println("Fundaciones en refoods ( " + fundaciones.size() + " ) ");
        for (Fundacion fundacion : fundaciones) {
            fundacion.mostrarDatos();
        }
    }

    @Override
    public void mostrarDatosPrincipales() {
        System.out.println(" Restaurantes en Refoods  : " + restaurantes.size());
        System.out.println(" Fundaciones en Refoods : " + fundaciones.size());
    }

    //Metodos sobre restaurantes 
    public void mostrarRestaurantes() //Resivir elemento grafico
    {
        Metodos.mostrarDatos(restaurantes);
    }

    public void agregarRestaurante(Restaurante restaurante, Admin admin) {
        restaurante.setId(Metodos.crearId(restaurantes));
        restaurante.crearAdmin();
        restaurantes.add(restaurante);
        buscarRestaurante(3, Tipo_Accion.ELIMINAR);
    }

    public void buscarRestaurante(int id, Tipo_Accion tAccion, Restaurante... r) //removeIF (Es un predicado)
    {
        for (Restaurante restaurante : restaurantes) {
            if (restaurante.getId() == id) {
                //aqui ira tabla
            }
        }
        //Metodos.buscarElemento(restaurantes,(us)-> us.getId() == id );

    }

    public Restaurante buscarRestaurante(int id) {
        for (Restaurante restaurante : restaurantes) {
            if (restaurante.getId() == id) {
                return restaurante;
            }
        }
        return null;
    }

    public void mostrarRestaurante() {
        for (Restaurante restaurante : restaurantes) {
            Metodos.mostrarDato(restaurante, restaurante.getNombre());
        }
    }

    public void eliminarRestaurante(int id) {
        if (Metodos.buscarElemento(restaurantes, (us) -> us.getId() == id)) {
            restaurantes.remove(buscarRestaurante(id));
        }
    }

    public void modificarRestaurante(int id) {
        if (Metodos.buscarElemento(restaurantes, (us) -> us.getId() == id)) {
            Restaurante restauranteEncontrado = buscarRestaurante(id);
            int opc = 0;
            //entrada validada con metodo generico
            switch (opc) {
                case 1: //modifica admin
                    modificarAdmin(restauranteEncontrado);
                    break;
                case 2: //modifica a algun empleado
                    modificarEmpleados(restauranteEncontrado);
                    break;
                case 3:
                    modificarFundacionesAsociadas(restauranteEncontrado);
                    break;
            }
            return;
        }
        System.out.println("Restaurante de id " + id + " no existe");
    }


    /*@Override
    public void cambioContrasena(String nuevaContrasena) { //Esto se debe implementar despues
        
    }

    @Override
    public void cambionNombreUsuario(String nuevoNombreUsuario) {
        
    }*/
    private void modificarAdmin(Restaurante restauranteEncontrado) {

        String nombre = "";//validar generico
        restauranteEncontrado.getAdmin().setNombreUsuario(nombre);
    }

    private void modificarEmpleados(Restaurante restauranteEncontrado) {
        int opc = 0;
        switch (opc) {
            case 1: //agrega empleado
                Empleado empleadoNuevo = null;
                restauranteEncontrado.getListaEmpleados().add(empleadoNuevo);
                //agregar empleado a lista
                break;
            case 2: //elimina empleado
                int idEmpleadoBuscar;
                Empleado empleadoEncontrado = null;// = Metodos.buscarElemento(restauranteEncontrado.getListaEmpleados(), (us) -> us.getId() == idEmpleadoBuscar);
                restauranteEncontrado.getListaEmpleados().remove(empleadoEncontrado);
                break;

        }

        /*
        int idEmpleadoBuscar; //validar generico de id empleado a buscar        
        Empleado empleadoEncontrado; //= Metodos.buscarElemento(restauranteEncontrado.getListaEmpleados(),(emp)-> emp.getId() == idEmpleadoBuscar );
        
        if (empleadoEncontrado) {
            String nombre; //validar nombre a cambiar
            empleadoEncontrado.setNombre(nombre);
            System.out.println("Empleado modificado !");
            return;
        }
        System.out.println("No se encuentra empleado de id "+idEmpleadoBuscar);
         */
    }

    /*
    falta : buscarElemento -> retorna Objeto 
     */
    private void modificarFundacionesAsociadas(Restaurante restauranteEncontrado) {
        int opc = 0;
        switch (opc) {
            case 1: //agrega empleado
                Fundacion fundacionNueva = null;
                restauranteEncontrado.getListaFundacionesAsociadas().add(fundacionNueva);
                //agregar empleado a lista
                break;
            case 2: //elimina empleado
                int idFundacionBuscar;
                Fundacion fundacionEncontrada = null;// = Metodos.buscarElemento(restauranteEncontrado.getListaEmpleados(), (us) -> us.getId() == idFundacionBuscar);
                restauranteEncontrado.getListaEmpleados().remove(fundacionEncontrada);
                break;
        }
    }

    //Metodos sobre fundaciones 
    public void agregarFundacion(Fundacion fundacion) {
        fundacion.setId(Metodos.crearId(fundaciones));
        fundaciones.add(fundacion);
        buscarFundacion(3, Tipo_Accion.ELIMINAR);
    }

    private void buscarFundacion(int id, Tipo_Accion tipo_Accion) {
        for (Fundacion fundacion : fundaciones) {
            if (fundacion.getId() == id) {
                //aqui ira tabla
                return;
            }
        }
    }

    public Fundacion buscarFundacion(int id) {
        for (Fundacion fundacion : fundaciones) {
            if (fundacion.getId() == id) {
                return fundacion;
            }
        }
        return null;
    }

    public void modificarFundacion(int id) {
        if (Metodos.buscarElemento(fundaciones, (us) -> us.getId() == id)) {
            Fundacion fundacionEncontrada = buscarFundacion(id);
            int opc = 0;
            //entrada validada con metodo generico
            switch (opc) {
                case 1: //modifica nombre
                    String nombre = "";
                    fundacionEncontrada.setNombre(nombre);
                    break;
                case 2: //modifica ubicacion
                    String ubicacion = "";
                    fundacionEncontrada.setUbicacion(ubicacion);
                    break;
            }
            return;
        }
        System.out.println("Fundacion de id " + id + " no existe");
    }

    public void eliminarFundacion(int id) {
        if (Metodos.buscarElemento(fundaciones, (f) -> f.getId() == id)) {
            fundaciones.remove(buscarFundacion(id));
        }
    }

    public void mostrarFundacion() {
        Metodos.mostrarDato(this, fundaciones);
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

}
