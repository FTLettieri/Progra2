/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author franl
 */
public class HeladeraInteligente extends Dispositivo implements Conectable{

    public HeladeraInteligente(String marca) {
        super(marca);
    }

    @Override
    public void encender() {
        this.encendido = true;
        System.out.println("Heladera encendida");
    }

    @Override
    public void apagar() {
        this.encendido = false;
        System.out.println("Heladera apagada");
    }

    @Override
    public void conectarWifi(String redWifi) {
        System.out.println("Conectado a la red " + redWifi);        
    }
    
    public void verTemperatura(){
        System.out.println("La temperatura es de 7°C");
    }
    
}
