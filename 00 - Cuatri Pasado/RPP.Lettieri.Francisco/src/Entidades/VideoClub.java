/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Iterator;

public class VideoClub implements Iterable<Pelicula>, Iterator<Pelicula> {
    private int capacidad;
    private int posicion;
    private ArrayList<Pelicula> peliculas;

    public VideoClub() {
        this.peliculas = new ArrayList<>();
        this.capacidad = 3;
    }
    
    public VideoClub(int capacidad) {
        this();
        this.capacidad = capacidad;
    }
    
    private boolean sonIguales (Pelicula pelicula) {
        boolean retorno = false;
        for (Pelicula peli : peliculas) {
            if (Pelicula.sonIguales(peli, pelicula)){
                retorno =  true;        
            }        
        }
       return retorno;
    }
    
    public void agregar(Pelicula pelicula){
        if (peliculas.size() >= this.capacidad) {
            System.out.println("No hay lugar para mas peliculas");
        } else if (sonIguales(pelicula)){
            System.out.println("La pelicula ya existe en el videoclub");
        } else {
            this.peliculas.add(pelicula);
        }
    }
    
    @Override
    public boolean hasNext(){
        return posicion < peliculas.size();
    }
    
    @Override
    public Pelicula next(){
        return peliculas.get(posicion++);
    }
    
    @Override
    public Iterator<Pelicula> iterator(){
        this.posicion = 0;
        return this;
    }
    
    private double getPrecio(TipoPelicula tipo) {
        double total = 0;
        for (Pelicula peli : peliculas) {
            if (tipo == TipoPelicula.DRAMA && peli instanceof PeliculaDrama) {
                total += ((PeliculaDrama) peli).getPrecioAlquiler();
            }
            if (tipo == TipoPelicula.ACCION && peli instanceof PeliculaAccion) {
                total += ((PeliculaAccion) peli).getPrecioAlquiler();
            }
        }
        return total;
    }
    
    public double getPrecioPeliculasDrama(){
        return getPrecio(TipoPelicula.DRAMA);
    }
    
    public double getPrecioPeliculasAccion(){
        return getPrecio(TipoPelicula.ACCION);
    }
    
    public double getPrecioTotal(){
        return getPrecio(TipoPelicula.DRAMA) + getPrecio(TipoPelicula.ACCION);
    }
    
    public static String mostrarTotales(VideoClub videoclub) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cantidad de peliculas en el videoclub: ").append(videoclub.peliculas.size());
        sb.append(System.lineSeparator());
        sb.append("Precio total peliculas de drama: $").append(videoclub.getPrecioPeliculasDrama());
        sb.append(System.lineSeparator());
        sb.append("Precio total peliculas de accion: $").append(videoclub.getPrecioPeliculasAccion());
        sb.append(System.lineSeparator());
        sb.append("Precio total de peliculas: $").append(videoclub.getPrecioTotal());
        
        return sb.toString();
    }
    
    
}
