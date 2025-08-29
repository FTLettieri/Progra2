/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author franl
 */
public class EmpleadoTiempoParcial extends Empleado {

    public EmpleadoTiempoParcial(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public double calcularSueldo() {
        return this.getSueldoBase();
    }
    
    @Override
    public String getTipo() {
        return "Medio tiempo";
    }
    
    
}
