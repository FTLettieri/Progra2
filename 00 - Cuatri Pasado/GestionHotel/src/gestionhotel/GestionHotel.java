/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionhotel;
import Entidades.*;
import java.time.LocalDate;
import java.util.ArrayList;
public class GestionHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // 1. Crear el Hotel
            Hotel hotelParaiso = new Hotel("Hotel Paraíso", "Calle Ficticia 123");

            // 2. Crear Habitaciones y agregarlas al hotel
            Habitacion h101 = new Habitacion(101, TipoHabitacion.SIMPLE, 50.0);
            Habitacion h102 = new Habitacion(102, TipoHabitacion.DOBLE, 80.0);
            Habitacion h201 = new Habitacion(201, TipoHabitacion.SUITE, 150.0);
            Habitacion h202 = new Habitacion(202, TipoHabitacion.DOBLE, 85.0);

            hotelParaiso.agregarHabitacion(h101);
            hotelParaiso.agregarHabitacion(h102);
            hotelParaiso.agregarHabitacion(h201);
            hotelParaiso.agregarHabitacion(h202);

            // 3. Crear Recepcionistas y agregarlos al hotel
            Recepcionista recepcionistaAna = new Recepcionista("Ana Pérez", "12345678A", "REC001");
            Recepcionista recepcionistaLuis = new Recepcionista("Luis García", "87654321B", "REC002");

            hotelParaiso.agregarRecepcionista(recepcionistaAna);
            hotelParaiso.agregarRecepcionista(recepcionistaLuis);

            System.out.println("\n--- Estado Inicial del Hotel ---");
            System.out.println(hotelParaiso);
            System.out.println("Habitaciones del hotel: " + hotelParaiso.getHabitaciones());
            System.out.println("Recepcionistas del hotel: " + hotelParaiso.getRecepcionistas());

            // 4. Crear Clientes
            Cliente clienteJuan = new Cliente("Juan Lopez", "11223344C", "juan.lopez@example.com");
            Cliente clienteMaria = new Cliente("Maria Diaz", "55667788D", "maria.diaz@example.com");

            System.out.println("\n--- Proceso de Reservas ---");

            // Cliente Juan intenta realizar una reserva (pendiente de confirmación)
            LocalDate inicio1 = LocalDate.of(2025, 6, 10);
            LocalDate fin1 = LocalDate.of(2025, 6, 15);
            System.out.println("\n" + clienteJuan.getNombre() + " intenta reservar habitación " + h102.getNumero());
            clienteJuan.realizarReserva(hotelParaiso, h102, inicio1, fin1);
            System.out.println("Reservas de Juan: " + clienteJuan.getReservas());

            // Ver notificaciones de los recepcionistas (Ana debería tener una)
            System.out.println("\nNotificaciones de Ana: " + recepcionistaAna.getNotificaciones());

            // Recepcionista Ana confirma la reserva de Juan
            System.out.println("\n" + recepcionistaAna.getNombre() + " confirma la reserva de " + clienteJuan.getNombre());
            if (!clienteJuan.getReservas().isEmpty()) {
                Reserva reservaJuan = clienteJuan.getReservas().get(0);
                recepcionistaAna.confirmarReserva(reservaJuan, hotelParaiso);
            }

            // La reserva de Juan ya debería estar en el hotel y Juan debería tener una notificación
            System.out.println("\nReservas confirmadas del hotel: " + hotelParaiso.getReservas());
            System.out.println("Notificaciones de Juan: " + clienteJuan.getNotificaciones());

            // Cliente Maria busca habitaciones disponibles (antes de la reserva de Juan)
            LocalDate inicioMaria = LocalDate.of(2025, 7, 1);
            LocalDate finMaria = LocalDate.of(2025, 7, 5);
            System.out.println("\n" + clienteMaria.getNombre() + " busca habitaciones DOBLES del " + inicioMaria + " al " + finMaria);
            ArrayList<Habitacion> disponiblesMaria = hotelParaiso.buscarHabitacionDisponible(inicioMaria, finMaria, TipoHabitacion.DOBLE);
            System.out.println("Habitaciones DOBLES disponibles para Maria: " + disponiblesMaria);

            // Cliente Maria intenta reservar una habitación DOBLE
            if (!disponiblesMaria.isEmpty()) {
                Habitacion habitacionMaria = disponiblesMaria.get(0);
                System.out.println("\n" + clienteMaria.getNombre() + " intenta reservar habitación " + habitacionMaria.getNumero());
                clienteMaria.realizarReserva(hotelParaiso, habitacionMaria, inicioMaria, finMaria);
                System.out.println("Reservas de Maria: " + clienteMaria.getReservas());
            }

            // Recepcionista Luis confirma la reserva de Maria
            System.out.println("\n" + recepcionistaLuis.getNombre() + " confirma la reserva de " + clienteMaria.getNombre());
            if (!clienteMaria.getReservas().isEmpty()) {
                Reserva reservaMaria = clienteMaria.getReservas().get(0);
                recepcionistaLuis.confirmarReserva(reservaMaria, hotelParaiso);
            }

            System.out.println("\nReservas confirmadas del hotel después de Maria: " + hotelParaiso.getReservas());

            // Intento de doble confirmación
            System.out.println("\n" + recepcionistaAna.getNombre() + " intenta confirmar nuevamente la reserva de " + clienteJuan.getNombre());
            if (!clienteJuan.getReservas().isEmpty()) {
                Reserva reservaJuan = clienteJuan.getReservas().get(0);
                recepcionistaAna.confirmarReserva(reservaJuan, hotelParaiso);
            }

            // Intento de reservar una habitación ocupada (simulando conflicto de fechas)
            LocalDate inicioConflicto = LocalDate.of(2025, 6, 12); // Se solapa con la reserva de Juan
            LocalDate finConflicto = LocalDate.of(2025, 6, 17);
            System.out.println("\n" + clienteMaria.getNombre() + " intenta reservar habitación " + h102.getNumero() + " (ocupada por Juan) del " + inicioConflicto + " al " + finConflicto);
            clienteMaria.realizarReserva(hotelParaiso, h102, inicioConflicto, finConflicto);

            // Ver notificaciones de Juan
            System.out.println("\nNotificaciones de Juan al final: " + clienteJuan.getNotificaciones());

            // Ver notificaciones de Ana
            System.out.println("Notificaciones de Ana al final: " + recepcionistaAna.getNotificaciones());
        }
}
