/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enumeradores;

public enum Bebida {
    CAFE("Cafe","Caliente"),
    TE("Te","Caliente"),
    JUGO("Jugo","Fria"),
    AGUA("Agua","Fria"),
    GASEOSA("Gaseosa","Fria");
    
    private String descripcion;
    private String tipo;
    
    private Bebida(String desc, String tipo){
        this.descripcion = desc;
        this.tipo = tipo;
    }
            
    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }
    
    
    
}
