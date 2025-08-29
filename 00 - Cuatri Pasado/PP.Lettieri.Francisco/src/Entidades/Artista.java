/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class Artista {
    private String nombre;
    private String apellido;

    public Artista(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public static boolean sonIguales(Artista a1, Artista a2) {
        boolean retorno = false;
        if (a1 == null || a2 == null) {
            retorno = false;
        }

        if (a1.getNombreApellido().equals(a2.getNombreApellido())){
            retorno = true;
        }
        return retorno;
    }
    
    public String getNombreApellido(){
        return this.nombre + " - " + this.apellido;
    }
    
}
