/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author franl
 */
public class Torneo <T extends Equipo>{
    private String nombre;
    private ArrayList<T> equipos;

    public Torneo(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
    }
    
    public void agregar(T equipo){
        if (equipos.contains(equipo)){
            System.out.println("El equipo ya esta anotado");
        } else {
            equipos.add(equipo);
        }
    }
    
    public String mostrar(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del torneo: ").append(this.nombre).append(System.lineSeparator());
        sb.append("Equipos inscriptos:").append(System.lineSeparator());
        for (T equipo : equipos) {
            sb.append(equipo.getFicha()).append(System.lineSeparator());
        }
        
        return sb.toString();
    }
    
    private String calcularPartido(T equipoL, T equipoV){
        Random random = new Random();
        int golesL = random.nextInt(10);
        int golesV = random.nextInt(10);
        
        return "[" + equipoL.nombre + "] " + golesL + " - " + golesV + " [" + equipoV.nombre + "]" ;
    }
    
    public String jugarPartido() {
        
        if  (equipos.size() < 2) {
            return "No hay suficientes equipos";
        } else {
            Random random = new Random();
            int indexL = random.nextInt(equipos.size());
            int indexV;
            do {
                indexV = random.nextInt(equipos.size());
                } while (indexL == indexV);
            T equipoL = equipos.get(indexL);
            T equipoV = equipos.get(indexV);
            
            return calcularPartido(equipoL, equipoV);
            }
        }
}
