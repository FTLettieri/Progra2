/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

public abstract class Persona {
    public String nombre;
    public String dni;
    public ArrayList<String> notificaciones;
    
    Persona(){
        this.notificaciones = new ArrayList<>();
    }

    Persona(String nombre, String dni) {
        this();
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public abstract void notificar(String notificacion);

    public String getNombre() {
        return this.nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public ArrayList<String> getNotificaciones() {
        return this.notificaciones;
    }
    
    protected void agregarNotificacion(String mensaje){
        this.notificaciones.add(mensaje);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(this.nombre).append(System.lineSeparator());
        sb.append("DNI: ").append(this.dni).append(System.lineSeparator());
        
        return sb.toString();
    }
}
