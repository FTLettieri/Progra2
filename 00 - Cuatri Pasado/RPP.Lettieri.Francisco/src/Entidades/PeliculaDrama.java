/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author franl
 */
public class PeliculaDrama extends Pelicula implements IAlquilable {
    public GeneroDrama tipoDrama;

    public PeliculaDrama(String titulo, double precio, String nombre, String apellido, String dni, GeneroDrama tipoDrama) {
        super(titulo, precio, nombre, apellido, dni);
        this.tipoDrama = tipoDrama;
    }
    
    @Override
    public double getPrecioAlquiler(){
        double valorFinal = 0.0;
        switch(this.tipoDrama){
            case ROMÁNTICO:
                valorFinal = this.precio * 1.5;
            case SOCIAL:
                valorFinal = this.precio * 1.4;
            case HISTÓRICO:
                valorFinal = this.precio * 1.2;            
        }  
        return valorFinal;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Tipo Drama: ").append(this.tipoDrama);
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
        
        final PeliculaDrama other = (PeliculaDrama) obj;
           
        return super.equals(obj) && this.tipoDrama == other.tipoDrama;
    }
    
}
