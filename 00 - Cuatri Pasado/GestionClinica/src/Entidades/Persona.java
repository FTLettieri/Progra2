/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Objects;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String dni;

    public Persona(String nombre, String apellido, int edad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }
    
    public String getNombreYApellido(){
        return this.nombre + " " + this.apellido;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(this.nombre);
        sb.append(System.lineSeparator());
        sb.append("Apellido: ").append(this.apellido);
        sb.append(System.lineSeparator());
        sb.append("Edad: ").append(this.edad);
        sb.append(System.lineSeparator());
        sb.append("DNI: ").append(this.dni);
        sb.append(System.lineSeparator());
        
        return sb.toString();
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
        final Persona other = (Persona) obj;
        return Objects.equals(this.dni, other.dni);
/**
System.out.println(p1.equals(p2)); // true (porque tienen el mismo DNI)
System.out.println(p1.equals(p3)); // false (DNI diferente)
 */
    }

    

}
