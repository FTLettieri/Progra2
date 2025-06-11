package taller;
import Entidades.*;

public class AppTaller {

    public static void main(String[] args) {
        
        Taller taller = Taller.getInstancia(3); // Singleton
        //Taller taller = new Taller(10);
        Taladro t1 = new Taladro("Bosch", 2, 1500, true);
        Taladro t2 = new Taladro("Philco", 2, 2500, false);
        LlaveInglesa l1 = new LlaveInglesa("Philips", 1, TipoMaterial.ACERO, false);
        LlaveInglesa l2 = new LlaveInglesa("Lusqtoff", 1, TipoMaterial.TITANIO, true);
        
        if(taller.agregarHerramienta(t1)){
            System.out.println("Herramienta agregada");
        } else {
            System.out.println("Taller lleno");
        }
        if(taller.agregarHerramienta(t2)){
            System.out.println("Herramienta agregada");
        } else {
            System.out.println("Taller lleno");
        }
        if(taller.agregarHerramienta(l1)){
            System.out.println("Herramienta agregada");
        } else {
            System.out.println("Taller lleno");
        }
        if(taller.agregarHerramienta(l2)){
            System.out.println("Herramienta agregada");
        } else {
            System.out.println("Taller lleno");
        }
        
        System.out.println(System.lineSeparator());
        taller.mostrarHerramientas();
        System.out.println("Cantidad herramientas: ");
        System.out.println( taller.getCantidadHerramientas());


    }
    
}
