/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Objects;
import java.util.Random;


public abstract class ObraArte implements Comparable<ObraArte> {
    protected Artista artista;
    protected int cantidadDeElementos;
    protected String titulo;
    protected double valor;
    protected static Random generadorDeElementos;

    public ObraArte(String titulo, double valor, Artista artista) {
        this.artista = artista;
        this.titulo = titulo;
        this.valor = valor;
    }
    
    public ObraArte(String titulo, double valor, String nombre, String apellido) {
        this(titulo,valor,new Artista(nombre, apellido));
    }
    /*
    public ObraArte(String titulo, double valor, String nombre, String apellido) {
        this.titulo = titulo;
        this.valor = valor;
        this.artista = new Artista(nombre, apellido);
    }*/
    
    static {
        generadorDeElementos = new Random();
    }
    
    public int getCantidadDeElementos(){
        if (this.cantidadDeElementos == 0){
            this.cantidadDeElementos = this.generadorDeElementos.nextInt(10) + 1; //si dejo 10 solo es de 0 a 9
        }
        return this.cantidadDeElementos;    
    }
    

    
    private String mostrar(ObraArte obra){
        StringBuilder sb = new StringBuilder();
        /*sb.append("Titulo: ").append(this.titulo);
        sb.append(System.lineSeparator());
        sb.append("Artista: ").append(obra.artista.getNombreApellido());
        sb.append(System.lineSeparator());
        sb.append("Cantidad: ").append(this.getCantidadDeElementos());
        sb.append(System.lineSeparator());*/
        sb.append(this);
        sb.append("Valor: $").append(this.valor);
        sb.append(System.lineSeparator());
        
        return sb.toString();
    }
    
    public static boolean sonIguales(ObraArte obra1, ObraArte obra2){
        boolean retorno = false;
        if (obra1 == null || obra2 == null) {
            retorno = false;
        }
        
        if (obra1.titulo.equals(obra2.titulo) && Artista.sonIguales(obra1.artista, obra2.artista)) {
            retorno = true;
        }
        
        return retorno;
    }

    @Override
    public int compareTo(ObraArte obra){
        return this.titulo.compareTo(obra.titulo);
    }
    
 /*   @Override
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
        final ObraArte other = (ObraArte) obj;
        return Objects.equals(this.titulo, other.titulo) && Objects.equals(this.artista, other.artista);
    }*/
    
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
        final ObraArte other = (ObraArte) obj;
        return ObraArte.sonIguales(this, other);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo: ").append(this.titulo);
        sb.append(System.lineSeparator());
        sb.append("Artista: ").append(this.artista.getNombreApellido());
        sb.append(System.lineSeparator());
        sb.append("Cantidad: ").append(this.getCantidadDeElementos());
        sb.append(System.lineSeparator());
        return sb.toString();
    }
    
}
