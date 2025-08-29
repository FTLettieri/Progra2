/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class Habitacion {
    private int numero;
    private TipoHabitacion tipo;
    private double precioPorNoche;

    public Habitacion(int numero, TipoHabitacion tipo, double precioPorNoche) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
    }

    public int getNumero() {
        return this.numero;
    }

    public TipoHabitacion getTipo() {
        return this.tipo;
    }

    public double getPrecioPorNoche() {
        return this.precioPorNoche;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Num habitacion: ").append(this.numero).append(System.lineSeparator());
        sb.append("Tipo habitacion: ").append(this.tipo).append(System.lineSeparator());
        sb.append("Precio: ").append(this.precioPorNoche).append(System.lineSeparator());
        
        return sb.toString();
    }
    
    
    
}
