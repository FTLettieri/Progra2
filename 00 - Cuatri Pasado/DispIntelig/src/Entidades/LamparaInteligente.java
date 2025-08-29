/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author franl
 */
public class LamparaInteligente extends Dispositivo implements Conectable{

    public LamparaInteligente(String marca) {
        super(marca);
    }

    @Override
    public void encender() {
        this.encendido = true;
        System.out.println("Lampara encendida");
    }

    @Override
    public void apagar() {
        this.encendido = false;
        System.out.println("Lampara apagada");
    }

    @Override
    public void conectarWifi(String redWifi) {
        System.out.println("Conectado a la red " + redWifi);        
    }
    
    public void cambiarColor(String color){
        System.out.println("Cambiando el color a " + color);        
    }
    
}
