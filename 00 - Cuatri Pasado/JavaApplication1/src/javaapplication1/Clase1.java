
package javaapplication1;

import java.util.Scanner;

public class Clase1 {
    // constantes suelen ir en la clase para usarla en todos lados.
    final static double CONSTANTE = 9; //final -> declara que es constante - Constantes siempre en mayuscula

    public static void main(String[] args) { //VOID es porque no devuelve nada
        
        //int nro = 4;
        
        //Mostrar(nro);
        //System.out.println("Hola Mundo");     sout TAB -> shortcut
        
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese Edad");
        int edad = scanner.nextInt();
        */
      
        
        /* El nextInt no te toma el enter, se le agrega un nextline en el medio */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese Edad");
        
        // Solucion 1
        int edad = scanner.nextInt();    
        scanner.nextLine(); // Limpiar el buffer del enter del nextInt
        
        // Solucion 2
        //int edad2 = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Ingrese Nombre");
        String nombre = scanner.nextLine();

        
        System.out.println(nombre + " " + edad);
        
        
    }

    public static void Mostrar(int entero){ 
        System.out.println("Numero: " + entero);
    }
}
