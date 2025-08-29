package torneo;
import Entidades.*;
import java.time.LocalDateTime;

public class TorneoMain {

    public static void main(String[] args) {
        Torneo<EquipoFutbol> TF = new Torneo<>("Premier");
        Torneo <EquipoBasquet> TB = new Torneo<>("Vasco");
        EquipoFutbol F1 = new EquipoFutbol("Equipo A", LocalDateTime.now());
        EquipoFutbol F2 = new EquipoFutbol("Equipo B", LocalDateTime.now());
        EquipoFutbol F3 = new EquipoFutbol("Equipo C", LocalDateTime.now());
        EquipoFutbol F4 = new EquipoFutbol("Equipo A", LocalDateTime.now());
        EquipoBasquet B1 = new EquipoBasquet("Equipo D", LocalDateTime.now());
        EquipoBasquet B2 = new EquipoBasquet("Equipo E", LocalDateTime.now());
        EquipoBasquet B3 = new EquipoBasquet("Equipo F", LocalDateTime.now());
        
        TF.agregar(F1);
        TF.agregar(F2);
        TF.agregar(F3);
        TF.agregar(F4);
        
        TB.agregar(B1);
        TB.agregar(B2);
        TB.agregar(B3);
        
        System.out.println(TF.mostrar());
        System.out.println(TB.mostrar());
        
        System.out.println("Partidos futbol: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(TF.jugarPartido());
        }
        
        System.out.println("Partidos basquet: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(TB.jugarPartido());
        }
    }
    
}
