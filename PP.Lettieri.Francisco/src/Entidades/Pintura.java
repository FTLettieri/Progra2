/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Objects;

public class Pintura extends ObraArte implements IVendible {
    public TecnicaPintura tecnica;

    public Pintura(String titulo, double valor, String nombre, String apellido, TecnicaPintura tecnica) {
        super(titulo, valor, nombre, apellido);
        this.tecnica = tecnica;
    }
   
    @Override 
    public double getValorComercial(){
        double valorFinal = 0.0;
        switch(this.tecnica){
            case OLEO:
                valorFinal = this.valor * 1.3;
            case ACRILICO:
                valorFinal = this.valor * 1.2;
            case ACUARELA:
                valorFinal = this.valor * 1.1;            
        }  
        return valorFinal;
    }

    @Override
    public String toString(){ 
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()); 
        sb.append("Tecnica de pintura: ").append(this.tecnica);
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
        final Pintura other = (Pintura) obj;
        return super.equals(obj) && Objects.equals(this.tecnica, other.tecnica);
    }
}
