/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author franl
 */
public class Curso {
    private String nombreCurso;
    private int cantidadHoras;
    private Alumno alumno; 

    public Curso(String nombreCurso, int cantidadHoras) { // constructor, inicializar datos
        this.nombreCurso = nombreCurso;
        this.cantidadHoras = cantidadHoras;
        this.alumno = null; //ya viene asi, pero lo pide
    }
    
    public void setAlumno(Alumno alumno){ //setter
            //if (alumno.getEdad() >= 18) { //miro el parametro del objeto que entra como atributo
            if (this.validarEdad(alumno.getEdad())) { 
                this.alumno = alumno;
            } else {
                this.alumno = null;
                System.out.println("No se pudo ingresar al alumno");
            }
    }
    
    private boolean validarEdad(int edad){
        return edad >= 18; //como es un booleando, va a devolver true o false
    }
    
    public String mostrarInfo(){
        String mensaje = this.nombreCurso + "\n" + this.cantidadHoras + "\n";
        if (this.alumno != null) {
            mensaje += this.alumno.getNombreCompleto() + "\n" + this.alumno.getEdad();
        } 
        return mensaje;
    }
}
