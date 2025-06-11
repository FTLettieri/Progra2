/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesobrecargastringenum;

import Enumeradores.*;
import java.util.Scanner;

public class ClaseSobrecargaStringEnum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese una frase:");
        String frase = scanner.nextLine();
        
        System.out.println("La frase tiene " + frase.length() + " caracteres");
        System.out.println("La frase tiene " + frase.split(" ").length + " palabras"); // el split crea un array con las palabras separadas por el parametro " ", con el length estamos pidiendo la cantidad de "indices" que indicaria la cantidad de palabras guardadas
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
        
        if (frase.toLowerCase().contains("java")){
            System.out.println("La frase tiene la palabra java");
        }

        if (frase.equalsIgnoreCase("java")){
            System.out.println("La frase es simplemente java");
        }
        
        
        StringBuilder cadena = new StringBuilder();
        for (int i = 1; i < 101; i++) {
            cadena.append(i).append("-"); //asi me queda el - post 100, deberia 
        }
        
       cadena.delete(cadena.length()-1,cadena.length());
        System.out.println(cadena);
        System.out.println(cadena.length());
        
        Libro libro = new Libro("El señor de los anillos", "Tolkien", Genero.FICCION);
        
        System.out.println(libro.esGenero(Genero.ENSAYO.toString())); // podria poner un string directo en vez de "Genero.ENSAYO.toString()"
        
        Pedido pedido1  = new Pedido("Fran", Bebida.CAFE);
        
        if (pedido1.esBebidaFria()){
            System.out.println("Bebida Fria");
        } else {
            System.out.println("Bebida Caliente");
        }
       
    }
}
