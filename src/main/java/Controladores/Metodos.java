/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author jonathanvega
 */
public class Metodos {
    
    public static <T> void mostrarDato(T variable, T...datos)
    {
        for (T dato : datos)
        {
            System.out.println(dato+":"+dato.getClass().getSimpleName());
        }
    }
    
    public static <T> void mostrarDatos(ArrayList<T> lista) //Pensarlo
    {
        int i = 0;
        for(T v : lista)
        {
            Field[] fields = v.getClass().getDeclaredFields();
            System.out.println("####################### Objeto: "+ i + "##################################");
            for(Field field : fields) {
                try {
                    String fieldName = field.getName();
                    Object fieldValue = field.get(v);
                    String nombreClase = fieldValue.getClass().getSimpleName();
                    if(nombreClase.equals("String") || nombreClase.equals("Integer") || nombreClase.equals("Float") || nombreClase.equals("Double") || nombreClase.equals("Boolean"))
                        System.out.println(fieldName + ":" + fieldValue + ":" + nombreClase);
                    else
                        mostrarDatos(field.get(v));
                } catch (IllegalArgumentException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            i++;
        }
        
        
        
    }
    
    public static <T> void mostrarDatos(T variable) //Pensarlo
    {
        Field []fields = variable.getClass().getDeclaredFields();
        System.out.println("-------------"+ variable.getClass().getSimpleName() + "----------------");
        for(Field field : fields)
        {
            try {
                String fieldName = field.getName();
                Object fieldValue = field.get(variable);
                String nombreClase = fieldValue.getClass().getSimpleName();
                
                 if(nombreClase.equals("String") || nombreClase.equals("Integer") || nombreClase.equals("Float") || nombreClase.equals("Double") || nombreClase.equals("Boolean"))
                    System.out.println(fieldName + ":" + fieldValue + ":" + nombreClase);
                else
                    mostrarDatos(field.get(variable));
            } catch (IllegalArgumentException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static <T> int crearId(ArrayList<T> lista)   //Pensarlo
    {
        try
            {
            for(int i = 0 ; i < lista.size() ; i++)
            {
                Method metodo = lista.get(i).getClass().getMethod("getId");
                int id = (int)metodo.invoke(lista.get(i));
                //System.out.println("IdCreado ..: " + (i));
                if(i != id)
                {
                    System.out.println("IdCreado ..: " + (i));
                    return i;
                }

            }
        }catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e)
        {
        
        }
        
        //System.out.println("IdCreado: " + lista.size());
        return lista.size() ; 
    }
    
    public static <T> boolean buscarElemento(ArrayList<T> lista, Predicate<? super T> filtro) //Pensarlo
    {
        try{
        
            ArrayList<T> listaNueva = (ArrayList<T>) lista.stream().filter(filtro).collect(Collectors.toList());

            return listaNueva.size() > 0;
        }catch(Error e)
        {
            System.out.println(e.getMessage());
        }
        return false;
        

    }
    
    public static <T> T getbuscarElemento(ArrayList<T> lista, Predicate<? super T> filtro)
    {
        try{
        
            ArrayList<T> listaNueva = (ArrayList<T>) lista.stream().filter(filtro).collect(Collectors.toList());

            return listaNueva.get(0);
        }catch(Error e)
        {
            System.out.println(e.getMessage());
        }
        return null;
        
    }
    
    
}
