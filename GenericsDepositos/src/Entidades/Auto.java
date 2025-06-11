/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Objects;

public class Auto {
    private String color;
    private String marca;

    public Auto(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    public String getColor() {
        return this.color;
    }

    public String getMarca() {
        return this.marca;
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
        final Auto other = (Auto) obj;

        return Objects.equals(this.getMarca(), other.getMarca()) && Objects.equals(this.getColor(), other.getColor());
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("--Auto--").append(System.lineSeparator());
        sb.append("Marca: ").append(this.getMarca()).append(System.lineSeparator());
        sb.append("Color: ").append(this.getColor()).append(System.lineSeparator());
        return sb.toString();
    }
    
}
