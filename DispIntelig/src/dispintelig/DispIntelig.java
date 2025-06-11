package dispintelig;

import Entidades.*;
import java.util.ArrayList;

public class DispIntelig {

    
    public static void main(String[] args) {
        ArrayList <Conectable> conectables = new ArrayList<>();
        
        SmartTV s1 = new SmartTV("Samsung");
        HeladeraInteligente h1 = new HeladeraInteligente("LG");
        LamparaInteligente l1 = new LamparaInteligente("Phillips");
        
        conectables.add(s1);
        conectables.add(h1);
        conectables.add(l1);
        
        for (Conectable conectable : conectables) {
            conectable.encender();
            conectable.conectarWifi("Fran 5GHz");    
            System.out.println("");   
        }
        
        s1.reproducirStreaming("Netflix");
        System.out.println("");   
        h1.verTemperatura();
        System.out.println("");   
        l1.cambiarColor("Rojo");
        System.out.println("");   
        
        System.out.println("Estado TV: ");
        s1.mostrarEstado();
        System.out.println("");
        System.out.println("Estado Heladera: ");
        h1.mostrarEstado();
        System.out.println("");        
        System.out.println("Estado Lampara: ");
        l1.mostrarEstado();
        System.out.println("");   

        
        for (Conectable conectable : conectables) {
            conectable.apagar();
            System.out.println("");   
        }
            
        System.out.println("Estado TV: ");
        s1.mostrarEstado();
        System.out.println("");   
        System.out.println("Estado Heladera: ");
        h1.mostrarEstado();
        System.out.println("");   
        System.out.println("Estado Lampara: ");
        l1.mostrarEstado();
                
        
    }
    
}
