/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author franl
 */
public class Paciente extends Persona {
    private ArrayList<Tratamiento> tratamientos;

    public Paciente(String nombre, String apellido, int edad, String dni) {
        super(nombre, apellido, edad, dni);
        tratamientos = new ArrayList<>();
    }
    
    public void agregarTratamiento(Tratamiento tratamiento){
        this.tratamientos.add(tratamiento);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        for (Tratamiento tratamiento : tratamientos) {
            sb.append(tratamiento);
            sb.append(System.lineSeparator());
            }
        return sb.toString();    
        }

}
