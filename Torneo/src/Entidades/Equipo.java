/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDateTime;

/**
 *
 * @author franl
 */
public abstract class Equipo {
    protected String nombre;
    protected LocalDateTime fechaCreacion;

    public Equipo(String nombre, LocalDateTime fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }
    
    public String getFicha(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.nombre).append(" fundado el ").append(this.fechaCreacion);
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
        final Equipo other = (Equipo) obj;
        return this.nombre.equals(other.nombre) && this.fechaCreacion.equals(other.fechaCreacion);
    }
    
}
