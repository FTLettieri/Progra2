/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author franl
 */
public class Tratamiento {
    private String descripcion;
    private int duracionDias;

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }
    
    public String getTratamiento(Tratamiento tratamiento, Medico medico, Paciente paciente){
        StringBuilder sb = new StringBuilder();
        sb.append("Tratamiento: ").append(this.descripcion);
        sb.append(System.lineSeparator());
        sb.append("Duracion del tratamiento: ").append(this.duracionDias);
        sb.append(System.lineSeparator());
        sb.append("Para el paciente");
        sb.append(paciente.toString());
        sb.append(System.lineSeparator());
        sb.append("Prescripto por:");
        sb.append(medico.toString());
        
        return sb.toString();
    }
    
}
