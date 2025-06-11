/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejestaticos;

public class Sesion {
    static String usuarioLogueado = null;
    
    static void login(String usuario){
        if (Sesion.usuarioLogueado == null){
            Sesion.usuarioLogueado = usuario;
        } else {
            System.out.println("Ya esta logueado el usuario " + Sesion.usuarioLogueado);
        }
    }
    
    static void logout(){
        Sesion.usuarioLogueado = null;
    }
    
    static void mostrarEstado(){
        if (Sesion.usuarioLogueado == null) {
            System.out.println("Sesion cerrada");
        } else {
            System.out.println("Sesion iniciada por el usuario " + Sesion.usuarioLogueado);
        }
    }
    
}
