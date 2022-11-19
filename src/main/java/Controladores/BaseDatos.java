/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;
import java.io.IOException;
import Modelos.*;

import javax.swing.JOptionPane;

import com.google.cloud.firestore.Firestore;
import java.awt.Component;
import Enums.*;
import Modelos.Refoods;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
/**
 *
 * @author jonathanvega
 */
public class BaseDatos {
    
    private static Firestore bd;
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    
    
    public static void conectar(Component padre)
    {
        try{
            FileInputStream serviceAccount = new FileInputStream("KeyFirebase.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
              .setCredentials(GoogleCredentials.fromStream(serviceAccount))
              .build();

            FirebaseApp.initializeApp(options);

            bd = FirestoreClient.getFirestore();
            System.out.println("Se conecto con exito");
            
            CollectionReference usuarios_ = bd.collection("Usuarios");
            ApiFuture<QuerySnapshot> querySnapshot = usuarios_.get();
            
            for(DocumentSnapshot documento : querySnapshot.get().getDocuments())
            {
                Usuario usuario = new Usuario(
                        documento.getString("nombreUsuario"),
                        documento.getString("contrasena"),
                        Tipo_Usuario.valueOf(documento.getString("tipoUsuario"))
                );
                usuarios.add(usuario);
            }
            
            for (Usuario user : usuarios) 
            {
                Metodos.mostrarDato(user, user.getNombreUsuario(), user.getContrasena());
            }
            
            
            
            
        }catch(IOException | InterruptedException | ExecutionException e)
        {
           JOptionPane.showMessageDialog(padre, e.getMessage()); 
        }
    }
    
    
    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
