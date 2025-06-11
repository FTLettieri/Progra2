/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class EntradaHistorial {
    private String descripcion;
    private Turno turno;

    public EntradaHistorial(String descripcion, Turno turno) {
        this.descripcion = descripcion;
        this.turno = turno;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Descripcion: ").append(this.descripcion);
        sb.append(System.lineSeparator());
        sb.append("Turno: ").append(turno.toString());
        
        return sb.toString();
    }
    
}
