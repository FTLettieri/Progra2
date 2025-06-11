/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enumeradores;

public class Libro {
    private String titulo;
    private String autor;
    private Genero genero;

    public Libro(String titulo, String autor, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }
    
    public boolean esGenero(String generoLibro){
        return genero.getDesc().equalsIgnoreCase(generoLibro);
    }
}
