package Entidades;

import java.util.ArrayList;

public class Taller {
    private static Taller instancia;
    
    private ArrayList<Herramienta> coleccionDeHerramientas = new ArrayList <> ();
    private int cantidadMaxima;

    public Taller(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }
// SINGLETON
    public static Taller getInstancia(int cantHerr){
        if (instancia==null){
            instancia = new Taller(cantHerr);
        }
        return instancia;
    }
  // HASTA ACA  
    public boolean agregarHerramienta(Herramienta herramienta){
        boolean retorno = false;
        if (this.coleccionDeHerramientas.size() < this.cantidadMaxima){
            this.coleccionDeHerramientas.add(herramienta);
            retorno = true;
        }
            
        return retorno;
    }
    
    public int getCantidadHerramientas(){
        return this.coleccionDeHerramientas.size();
    }
    
    public void mostrarHerramientas(){
        for (Herramienta herramienta : this.coleccionDeHerramientas){
            if (herramienta instanceof Taladro){
                System.out.println(((Taladro)herramienta).mostrarTaladro());
            }
            if (herramienta instanceof LlaveInglesa){
                System.out.println(((LlaveInglesa)herramienta).mostrarLlaveInglesa());
            }
        }
    }
               
}
