/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;
import java.time.Period;

public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean confirmada;

    public Reserva(Cliente cliente, Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.confirmada = false;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Habitacion getHabitacion() {
        return this.habitacion;
    }

    public LocalDate getFechaInicio() {
        return this.fechaInicio;
    }

    public LocalDate getFechaFin() {
        return this.fechaFin;
    }

    public boolean isConfirmada() {
        return this.confirmada;
    }
    
    public void confirmar(){
        if (!isConfirmada()){
            this.confirmada = true;
        }
    }
    
    public double calcularTotal(){
        Period diferencia;
        diferencia = Period.between(this.fechaInicio,  this.fechaFin);

        return (this.habitacion.getPrecioPorNoche()) * diferencia.getDays();
    } 
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("RESERVA").append(System.lineSeparator());
        sb.append(this.cliente.toString());
        sb.append("Habitacion: ").append(this.habitacion.toString()).append(System.lineSeparator());
        sb.append("Fecha de inicio: ").append(this.fechaInicio).append(System.lineSeparator());
        sb.append("Fecha de fin: ").append(this.fechaFin).append(System.lineSeparator());
        sb.append("Confirmacion: ").append(this.isConfirmada()).append(System.lineSeparator());
        //agregar costo total
        return sb.toString();
    }
    
    
    
}
