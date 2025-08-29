package javaapplication1;

import java.util.Scanner;

public class EjerciciosClase1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
/* 
1) Cree un programa que pida al usuario primero su edad, luego su nombre, luego
muestra un mensaje con esos datos. 
*/
/*
    System.out.println("Ingrese Edad: ");
    int edad = Integer.parseInt(scanner.nextLine());
    
    System.out.println("Ingrese Nombre: ");
    String nombre = scanner.nextLine();
   
    System.out.println("Nombre: " + nombre + " - Edad: " + edad);
*/

/*
2) Pide un número N por consola y muestra todos los números pares desde 1 hasta N.
*/
/* 
    System.out.println("Ingrese un numero: ");
    int numero = Integer.parseInt(scanner.nextLine());
    
    for(int i=0;i<=numero;i++){
        if (i != 0 && i%2==0){
            System.out.println(i);
        }
    }
*/

/*
3) Pide dos números por consola y verifica si el primero es múltiplo del segundo.
*/
/*
    System.out.println("Ingrese un numero: ");
    int numero1 = Integer.parseInt(scanner.nextLine());
    
    System.out.println("Ingrese otro numero: ");
    int numero2 = Integer.parseInt(scanner.nextLine());
    
    if (numero1%numero2 == 0){
        System.out.println("El numero " + numero1 + " es multiplo " + numero2 );
    }
        else{
            System.out.println("El numero " + numero1 + " no es multiplo " + numero2 );
                }
*/

/*
4) Pide un número por consola y muestra su tabla de multiplicar del 1 al 10.
*/
/*
    System.out.println("Ingrese un numero: ");
    int numero = Integer.parseInt(scanner.nextLine());
    
    for (int i = 1; i<=10;i++){
        System.out.println(numero + " x " + i + " = " + numero*i);
    }
*/

/*
5) Pide ingresar nombre, apellido y 3 notas (enteros) de un alumno por consola y
calcula el promedio.

-Si es menos que 4 que la consola muestre “Desaprobado”.
-Si supera el 4 inclusive que la consola muestre “Aprobado”.
-Si supera el 6 inclusive que la consola muestre “Promocionado”.
*/

    System.out.println("Ingrese Nombre: ");
    String nombre = scanner.nextLine();
    
    System.out.println("Ingrese Apellido: ");
    String apellido = scanner.nextLine();

    System.out.println("Ingrese la primera nota: ");
    int nota1 = Integer.parseInt(scanner.nextLine());
    while (nota1 < 0 || nota1 > 10){
         System.out.println("La nota no puede ser mayor a 10 o menor a 0. \nIngrese la primera nota: ");
         nota1 = Integer.parseInt(scanner.nextLine());
    }
    
    System.out.println("Ingrese la segunda nota: ");
    int nota2 = Integer.parseInt(scanner.nextLine());
    while (nota2 < 0 || nota2 > 10){
         System.out.println("La nota no puede ser mayor a 10 o menor a 0. \nIngrese la segunda nota: ");
         nota2 = Integer.parseInt(scanner.nextLine());
    }
    
    System.out.println("Ingrese la tercera nota: ");
    int nota3 = Integer.parseInt(scanner.nextLine()); 
    while (nota3 < 0 || nota3 > 10){
         System.out.println("La nota no puede ser mayor a 10 o menor a 0. \nIngrese la tercera nota: ");
         nota3 = Integer.parseInt(scanner.nextLine());
    }
    
    double promedio = Math.round(((nota1 + nota2 + nota3) / 3.0) * 100.0) / 100.0; // el round devuelve un long, entonces se multiplica por 100 para que no me redondee por ej un 9,6 a 10 y lo guarde como 960, despues se divida por 100 para retransformarlo a 9,6. Lo ideal seria un printf o un string.format

    boolean desaprobado = promedio < 4;
    boolean aprobado = promedio >= 4 && promedio < 6;
    boolean promocionado = promedio >= 6 && promedio <= 10;
    
    if (desaprobado){
        System.out.println(nombre + " " + apellido + " esta desaprobado");
    } else if (aprobado) {
        System.out.println(nombre + " " + apellido + " esta aprobado");
    } else if (promocionado) { // podria quedarse con else solo, pero para usar el booleano promocionado
        System.out.println(nombre + " " + apellido + " esta promocionado");
    } 
}
}


