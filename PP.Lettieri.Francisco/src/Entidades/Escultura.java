/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Objects;


public class Escultura extends ObraArte implements IVendible {
    public MaterialEscultura material;

    public Escultura(String titulo, double valor, Artista artista, MaterialEscultura material) {
        super(titulo, valor, artista);
        this.material = material;
    }

    /*
    public Escultura(String titulo, double valor, String nombre, String apellido, MaterialEscultura material) {
        super(titulo, valor, nombre, apellido);
        this.material = material;
    }
    */
    

    @Override
    public double getValorComercial(){
        double valorFinal = 0.0;
        switch(this.material){
            case MARMOL:
                valorFinal = this.valor * 1.5;
            case BRONCE:
                valorFinal = this.valor * 1.4;
            case MADERA:
                valorFinal = this.valor * 1.2;            
        }  
        return valorFinal;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()); //me olvide del append
        /*sb.append("Titulo: ").append(this.titulo);
        sb.append(System.lineSeparator());
        sb.append("Artista: ").append(this.artista.getNombreApellido());
        sb.append(System.lineSeparator());*/
        sb.append("Material de la escultura: ").append(this.material);
        sb.append(System.lineSeparator());
        sb.append("Valor comercial: ").append(this.getValorComercial());
        sb.append(System.lineSeparator());

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
        final Escultura other = (Escultura) obj;
        return super.equals(obj) && Objects.equals(this.material, other.material);
    }
}
