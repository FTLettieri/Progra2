/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author franl
 */
public class PeliculaAccion extends Pelicula implements IAlquilable {
    public GeneroAccion tipoAccion;

    public PeliculaAccion(String titulo, double precio, Director director, GeneroAccion tipoAccion) {
        super(titulo, precio, director);
        this.tipoAccion = tipoAccion;
    }
    

    @Override
    public double getPrecioAlquiler(){
        double valorFinal = 0.0;
        switch(this.tipoAccion){
            case AVENTURA:
                valorFinal = this.precio * 1.4;
            case BELICA:
                valorFinal = this.precio * 1.3;
            case SUPERHEROES:
                valorFinal = this.precio * 1.5;            
        }  
        return valorFinal;
    }
   
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Tipo accion: ").append(this.tipoAccion);
        sb.append("Precio alquiler: $").append(this.getPrecioAlquiler());
        
        return sb.toString();
    }    
    
     @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final PeliculaAccion other = (PeliculaAccion) obj;
           
        return Pelicula.sonIguales(this, other) && this.tipoAccion == other.tipoAccion;
    }
    
}
