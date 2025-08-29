package nba;
import Entidades.*;
import java.util.Random;
import java.util.Scanner;

public class NBA {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner (System.in);
        
        String nombreLocal;
        String nombreVisita;
        Random rnd = new Random();
        
        System.out.println("Ingrese Nombre del equipo local: ");
        nombreLocal = scanner.nextLine();
        
        Equipo local = new Equipo(nombreLocal);
        
        do {
            System.out.println("Ingrese Nombre del equipo visitante: ");
            nombreVisita = scanner.nextLine();
        } while (local.getNombre().equals(nombreVisita));

        Equipo visita = new Equipo(nombreVisita);
        
        //visita = local;

        if (!local.sonIguales(visita)) {
            Partido partido = new Partido(local, visita, rnd);
            partido.jugar(20);
        } else {
            System.out.println("El equipo no puede jugar contra si mismo");
        }
        
    }
    
}
