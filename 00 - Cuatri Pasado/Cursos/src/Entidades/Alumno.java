/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author franl
 */
public class Alumno { // clase
    private String nombre;
    private String apellido;
    private int edad;
    
    public Alumno(String nombre, String apellido, int edad) { //constructor
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public int getEdad(){ //getter
        return this.edad;
    }
    
    public String getNombreCompleto(){
        return this.nombre + " - " + this.apellido;
    }

}