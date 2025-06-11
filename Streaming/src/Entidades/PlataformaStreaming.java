/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class PlataformaStreaming {
    private static PlataformaStreaming instancia;
    private String nombre;
    
    public static PlataformaStreaming getInstancia(){
        if (instancia == null) {
            instancia = new PlataformaStreaming();
        }
        return instancia;
    }

    public PlataformaStreaming() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}

