/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author franl
 */
public class SmartTV extends Dispositivo implements Conectable {

    public SmartTV(String marca) {
        super(marca);
    }

    @Override
    public void encender() {
        this.encendido = true;
        System.out.println("TV encendida");
    }

    @Override
    public void apagar() {
        this.encendido = false;
        System.out.println("TV apagada");
    }

    @Override
    public void conectarWifi(String redWifi) {
        System.out.println("Conectado a la red " + redWifi);
    }

    public void reproducirStreaming(String servicio){
        System.out.println("Reproduciendo " + servicio);
    }
    
}
