/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class Recepcionista extends Persona {
    
    private String legajo;

    public Recepcionista(String nombre, String dni, String legajo) {
        super(nombre, dni);
        this.legajo = legajo;
    }

    public String getLegajo() {
        return this.legajo;
    }
    
    public void confirmarReserva(Reserva reserva, Hotel hotel){
        if (!reserva.isConfirmada()){
            reserva.confirmar();
            hotel.agregarReserva(reserva);
            reserva.getCliente().notificar("Reserva confirmada - Hotel: " + hotel.getNombre() + " Habitacion: " + reserva.getHabitacion());
            System.out.println("Reserva realizada");
        } else {
            System.out.println("Esta reserva ya fue confirmada");
        }
    }
    
    @Override
    public void notificar(String notificacion) {
        this.agregarNotificacion(notificacion);
    }
    
    
}
