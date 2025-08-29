/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Persona {
    private String mail;
    private ArrayList<Reserva> reservas;

    public Cliente(String nombre, String dni, String mail) {
        super(nombre, dni);
        this.mail = mail;
        this.reservas = new ArrayList<>();
    }

    public String getEmail() {
        return this.mail;
    }

    public ArrayList<Reserva> getReservas() {
        return this.reservas;
    }
    
    public void realizarReserva(Hotel hotel, Habitacion habitacion, LocalDate inicio, LocalDate fin){
        ArrayList <Habitacion> disponibles = hotel.buscarHabitacionDisponible(inicio, fin, habitacion.getTipo());
        if (disponibles.contains(habitacion)){
            Reserva reserva = new Reserva(this, habitacion, inicio, fin);
            reservas.add(reserva);
            
            for (Recepcionista recepcionista : hotel.getRecepcionistas()) {
                recepcionista.notificar("Nueva reserva para:" + super.toString() + "Hotel: " + hotel.getNombre() + "Habitacion: " + habitacion.getNumero());
            }
        } else {
            System.out.println("Habitacion no disponible");
        }
    }
    
    @Override
    public void notificar(String notificacion) {
        super.agregarNotificacion(notificacion);
    }
    
    
}
