/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class Cocina {
    private int codigo;
    private boolean esIndustrial;
    private float precio;

    public Cocina(int codigo, float precio, boolean esIndustrial) {
        this.codigo = codigo;
        this.esIndustrial = esIndustrial;
        this.precio = precio;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public boolean isIndustrial() {
        return this.esIndustrial;
    }

    public float getPrecio() {
        return this.precio;
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
        final Cocina other = (Cocina) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("--Cocina--").append(System.lineSeparator());
        sb.append("Codigo: ").append(this.getCodigo()).append(System.lineSeparator());
        sb.append("Industrial: ").append(this.isIndustrial()).append(System.lineSeparator());
        sb.append("Precio: ").append(this.getPrecio()).append(System.lineSeparator());
        return sb.toString();
    }
    
    
    
}
