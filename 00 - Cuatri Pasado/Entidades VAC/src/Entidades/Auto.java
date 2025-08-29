/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class Auto extends VehiculoAutonomo{

    public Auto(int id, String marca, String modelo) {
        super(id, marca, modelo);
    }
    
    @Override
    public void moverse(){
        System.out.println("Arranca a moverse el auto");
    }
    @Override
    public void detenerse(){
        System.out.println("Se detiene el auto");
    }

    @Override
    public void reportarEstado(){
        System.out.println("Auto " + this.marca + " " + this.modelo + "funciona correctamente");
    }
    
    
}
