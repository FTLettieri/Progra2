/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

public class Usuario {
    private String nombreUsuario;
    private ArrayList<ListaReproduccion> listas;
    private ArrayList<Contenido> historial;
    private ArrayList<Contenido> favoritos;

    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.listas = new ArrayList<>();
        this.favoritos = new ArrayList<>();
        this.historial = new ArrayList<>();
    }
    
    public void agregarFavorito(Contenido contenido){
        this.favoritos.add(contenido);
    }
    
    public void agregarListas(ListaReproduccion lista) {
        this.listas.add(lista);
    }
    
    public void guardarHistorial (Contenido contenido) {
        this.historial.add(contenido);
    }
    
}
