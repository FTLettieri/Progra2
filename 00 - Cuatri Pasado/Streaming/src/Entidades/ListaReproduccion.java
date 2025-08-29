/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

public class ListaReproduccion {
    private String nombre;
    private ArrayList<Contenido> contenidoLista;

    public ListaReproduccion(String nombre) {
        this.nombre = nombre;
        this.contenidoLista = new ArrayList<>();
    }
    
    public void agregarContenido(Contenido contenido){
        this.contenidoLista.add(contenido);
    }
 
}
