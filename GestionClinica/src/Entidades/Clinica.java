
package Entidades;

import java.util.ArrayList;

public class Clinica {
    private String nombre;
    private ArrayList<HistoriaClinica> historiales;
    private ArrayList<Turno> turnos;
    private ArrayList<Persona> personas;
    private static Clinica instancia;

    private Clinica() {
        this.historiales = new ArrayList<>();
        this.turnos = new ArrayList<>();
        this.personas = new ArrayList<>();
    }

   // Método público para acceder a la única instancia
    public static Clinica getInstancia() {
        if (instancia == null) {
            instancia = new Clinica();
        }
        return instancia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean agregarPersona(Persona persona){
        boolean retorno = false;
        if(!this.personas.contains(persona)){
            this.personas.add(persona);
            retorno = true;
        }
        return retorno;
    }
    
    public void agregarHistoriaClinica(HistoriaClinica historia) {
        historiales.add(historia);
    }
    
    @Override
    public String toString(){
        int cantMedicos = 0;
        int cantPacientes = 0;
        
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre clinica: ").append(this.nombre);
        sb.append(System.lineSeparator());
        sb.append("Personas de la clinica: ");
        sb.append(System.lineSeparator());        
        
         for (Persona persona : this.personas) {
            if (persona instanceof Medico) {
                cantMedicos ++;
                sb.append("--- Medico ---");
                sb.append(System.lineSeparator());
            } else if (persona instanceof Paciente) {
                cantPacientes ++;
                sb.append("--- Paciente ---");
                sb.append(System.lineSeparator());                
            }
            sb.append(persona.toString());
        }

        sb.append("Cantidad de medicos: ").append(cantMedicos);
        sb.append("Cantidad de pacientes: ").append(cantPacientes);
        sb.append("Cantidad de historiales: ").append(historiales.size());
                
        return sb.toString();
    }
}
