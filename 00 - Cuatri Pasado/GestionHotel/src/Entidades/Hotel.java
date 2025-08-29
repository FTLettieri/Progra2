/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    private String nombre;
    private String direccion;
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Recepcionista> recepcionistas;
    private ArrayList<Reserva> reservas;
    
    public Hotel(){
        this.habitaciones = new ArrayList<>();
        this.recepcionistas = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }
    public Hotel(String nombre, String direccion) {
        this();
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return this.habitaciones;
    }

    public ArrayList<Recepcionista> getRecepcionistas() {
        return this.recepcionistas;
    }

    public ArrayList<Reserva> getReservas() {
        return this.reservas;
    }
    
    public void agregarHabitacion(Habitacion habitacion){ //no repetir habitacion ?
        this.habitaciones.add(habitacion);
    }
    
    public void agregarRecepcionista(Recepcionista recepcionista){ //no repetir recepcionista ?
        this.recepcionistas.add(recepcionista);
    }
    
    public void agregarReserva(Reserva reserva){ 
        this.reservas.add(reserva);
    }
    
    public ArrayList<Habitacion> buscarHabitacionDisponible(LocalDate inicio, LocalDate fin, TipoHabitacion tipo){
        ArrayList<Habitacion> disponibles = new ArrayList<>();
        for (Habitacion habitacion : this.habitaciones) {
            if (habitacion.getTipo() == tipo){
                boolean ocupada = false;
                
                for (Reserva reserva : reservas) {
                    if (reserva.getHabitacion().equals(habitacion))
                        if (!(inicio.isAfter(reserva.getFechaFin()) || fin.isBefore(reserva.getFechaInicio()))){
                            ocupada = true;
                            break;
                        }                       
                }          
                if (!ocupada) {
                    disponibles.add(habitacion);
                }             
            }           
        }
        return disponibles;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Hotel: ").append(this.getNombre()).append(System.lineSeparator());
        sb.append("Direccion: ").append(this.getDireccion()).append(System.lineSeparator());
        sb.append("Recepcionistas: ").append(System.lineSeparator());
        for (Recepcionista recepcionista : recepcionistas) {
            sb.append(recepcionista.toString());
        }
        sb.append("Reservas: ").append(System.lineSeparator());
        for (Reserva reserva : reservas) {
            sb.append(reserva.toString());
        }
        sb.append("Habitaciones disponibles: ").append(System.lineSeparator());
        for (Habitacion habitacion : habitaciones) {
            sb.append(habitacion.toString());
        }
        
        return sb.toString();
    }
}
