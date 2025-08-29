/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class Director {
    private String nombre;
    private String dni;
    private String apellido;

    public Director(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.apellido = apellido;
    }
    
    public static boolean sonIguales(Director director1, Director director2){
        boolean retorno = false;
        if (director1 == null || director2 == null) {
            retorno = false;
        }
        
        if (director1.nombre.equals(director2.nombre) && director1.apellido.equals(director2.apellido) && director1.dni.equals(director2.dni)  ) {
            retorno = true;
        }
        
        return retorno;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Director: ").append(this.apellido).append(", ");
        sb.append(this.nombre).append(System.lineSeparator());
        
        return sb.toString();
    }
}
