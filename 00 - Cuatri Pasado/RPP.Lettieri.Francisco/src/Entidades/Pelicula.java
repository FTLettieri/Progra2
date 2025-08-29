/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Random;

/**
 *
 * @author franl
 */
public abstract class Pelicula {
    protected Director director;
    protected int cantidadDeEscenas;
    protected String titulo;
    protected double precio;
    protected static Random generadorDeEscenas;
    
    static {
        generadorDeEscenas = new Random();
    }

    public Pelicula( String titulo, double precio, Director director) {
        this.director = director;
        this.titulo = titulo;
        this.precio = precio;
        this.cantidadDeEscenas = 0;
    }

    public Pelicula(String titulo, double precio, String nombre, String apellido, String dni) {
        this(titulo, precio, new Director(nombre, apellido, dni));
    }

    public int getCantidadDeEscenas(){
        if (this.cantidadDeEscenas == 0){
            this.cantidadDeEscenas = this.generadorDeEscenas.nextInt(30) + 21;
        }
        return this.cantidadDeEscenas;    
    }
    
    private static String mostrarPelicula(Pelicula pelicula) {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo: ").append(pelicula.titulo).append(System.lineSeparator());
        sb.append(pelicula.director.toString()); //el toString no se si hace falta
        sb.append("Cant escenas: ").append(pelicula.getCantidadDeEscenas()).append(System.lineSeparator());

        
        return sb.toString();
    }
    
    static boolean sonIguales(Pelicula pelicula1, Pelicula pelicula2) {
        if (pelicula1 == null || pelicula2 == null) {
            return false;
        }

        return pelicula1.equals(pelicula2);        
    }
    
     @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        return this.titulo.equals(other.titulo) && Director.sonIguales(this.director, other.director);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(mostrarPelicula(this));
        sb.append("Precio: ").append(this.precio).append(System.lineSeparator());
        
        return sb.toString();
    }
}
