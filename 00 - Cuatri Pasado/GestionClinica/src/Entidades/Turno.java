
package Entidades;

import java.time.LocalDate;


public class Turno {
    private Paciente paciente;
    private Medico medico;
    private LocalDate fecha;

    public Turno(Paciente paciente, Medico medico, LocalDate fecha) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return medico;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Turno");
        sb.append(System.lineSeparator());
        sb.append("Paciente ").append(paciente.getNombreYApellido());
        sb.append(System.lineSeparator());
        sb.append("Medico").append(medico.getNombreYApellido());
        sb.append(System.lineSeparator());
        sb.append("Fecha: ").append(this.fecha);
        
        return sb.toString();
    }
    
    
}
