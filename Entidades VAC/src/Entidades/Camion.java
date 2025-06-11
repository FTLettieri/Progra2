/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class Camion extends VehiculoAutonomo {

    public Camion(int id, String marca, String modelo) {
        super(id, marca, modelo);
    }

    @Override
    public void moverse() {
        System.out.println("El camion se esta moviendo");
    }

    @Override
    public void detenerse() {
         System.out.println("El camion se esta frenando");  
    }

    @Override
    public void reportarEstado() { // hacer con sb y que devuelva String
        System.out.println("El camion " + this.marca + " " + this.modelo + " viene cargado por completo");
    }

}
