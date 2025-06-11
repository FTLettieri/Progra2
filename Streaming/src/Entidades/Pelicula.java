/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author franl
 */
public class Pelicula extends Contenido {
    private int duracion;

    public Pelicula(String titulo, int duracion) {
        super(titulo);
        this.duracion = duracion;
    }

    @Override
    public void reproducir() {
        System.out.println("La pelicula esta empezando...");
    }

    @Override
    public int obtenerDuracion() {
        return duracion;
    }
    
    
    
}
