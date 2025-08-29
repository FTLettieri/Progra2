
package Entidades;

public class Dron extends VehiculoAutonomo {

    public Dron(int id, String marca, String modelo) {
        super(id, marca, modelo);
    }

    @Override
    public void moverse() {
        System.out.println("El dron se esta moviendo");
    }

    @Override
    public void detenerse() {
        System.out.println("El dron aterrizo");
    }

    @Override
    public void reportarEstado() {
        System.out.println("El dron " + this.marca + " " + this.modelo + " esta grabando.");
    }
    
    public void volar() {
        System.out.println("El dron esta volando");
    }
    
}
