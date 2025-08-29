package javaapplication1;

import java.util.Scanner;

public class EjerciciosClase1b {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
/*
6) Ingresar una hora (de 0 a 23) y mostrar:
    ● "Buenos días" si está entre 6 y 12.
    ● "Buenas tardes" si está entre 13 y 20.
    ● "Buenas noches" si está entre 21 y 5.
*/

/*
        System.out.println("Ingrese la hora del dia (formato 24hrs): ");
        int hora = Integer.parseInt(scanner.nextLine());
        while (hora < 0 || hora > 24){
            System.out.println("Ingrese una hora valida: ");
            hora = Integer.parseInt(scanner.nextLine());
        }
        
        boolean mañana = hora >= 6 && hora <= 12;
        boolean tarde = hora >= 13 && hora <= 20;
        boolean noche = (hora >= 21 && hora <= 23) || (hora >= 0 && hora <= 5);


        if (mañana){
            System.out.println("Buen dia");
        } else if (tarde){
            System.out.println("Buenas tardes");
        } else if (noche){ // idem promedios, podria ser simplemente el else
            System.out.println("Buenas noches");
        }
*/

/* 
7) Pedir al usuario una edad y un ingreso mensual.
Mostrar si es apto para un crédito, sólo si:
    ● La edad es mayor o igual a 21
    ● Y el ingreso supera los $150,000
*/

/*
        int edadMinima = 21;
        int ingresoMinimo = 150000;
        
        System.out.println("Edad: ");
        int edad = Integer.parseInt(scanner.nextLine());
        while (edad < 0 || edad > 99){
            System.out.println("Ingrese una edad valida:");
            edad = Integer.parseInt(scanner.nextLine());
        }
        
        System.out.println("Ingreso mensual: ");
        int ingresoMensual = Integer.parseInt(scanner.nextLine());
        while (ingresoMensual < 0){
            System.out.println("El ingreso minimo debe ser 0:");
            ingresoMensual = Integer.parseInt(scanner.nextLine());
        }
        
        if (edad >= edadMinima && ingresoMensual >= ingresoMinimo){
            System.out.println("Es apto crédito");
        }
*/

/*
8) Pedir diez números enteros al usuario y determinar cuál es el mayor, cuál es menor y sacar el promedio.
*/

/*
        int mayor = Integer.MAX_VALUE;
        int menor = Integer.MIN_VALUE;
        int suma = 0;
        int cantNumeros = 10;
        for (int i = 1; i<=cantNumeros;i++){
            System.out.println("Ingrese un numero mayor a 0: ");
            int num = Integer.parseInt(scanner.nextLine());
            while (num < 0){
                System.out.println("Ingrese una edad valida:");
                num = Integer.parseInt(scanner.nextLine());
            }
            
            suma += num;
            
            if (num > mayor){
                mayor = num;
            } else if (num < menor) {
                menor = num;
            }
        }
        double promedio = Math.round((suma/cantNumeros) * 100.0) / 100;
        System.out.println("El promedio de los numeros es " + promedio);
        System.out.println("El menor numero ingresado fue " + menor);
        System.out.println("El mayor numero ingresado fue " + mayor);
*/

/*
9) Pedir una letra (‘a’, ‘b’, ‘c’, ‘d’, etc...) e indicar si es vocal o consonante.
Nota: Usar Switch.
*/

/*
        System.out.println("Ingrese una letra");
      
        //char letra = scanner.nextLine().charAt(0); 
        //charAt es para tomar la primera letra, sino hay que tomar un string y despues hacer un .length() para ver si es 1 
        //tambien se puede validar si en la pos 1 es una letra con .isLetter().
    
        String entrada = scanner.nextLine();
        while (entrada.length()!= 1 || !Character.isLetter(entrada.charAt(0))){ // mientras la longitud de la entrada no sea 1 o el unico caracter no sea una letra. Necesito que se cumpla 1 de las 2 para que vuelva a pedir
            System.out.println("Ingrese una letra: ");
            entrada = scanner.nextLine();
        }
        char letra = entrada.charAt(0); // tengo que poner el char.At(0) porque sino intenta convertir un string a char y no se puede.
        
        switch(Character.toLowerCase(letra)){ // Convertimos el char de letra a minuscula
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("La letra es una vocal");
                break;
            default:
                System.out.println("La letra es una consonante");
                break;
        }
*/

/*
10) Realizar un programa que pida al usuario un número entero positivo correspondiente a la cantidad de
lados (long de lado?) de un cuadrado (mínimo 2).
Luego, debe dibujar en consola un cuadrado de asteriscos (*) de ese tamaño.
Ejemplo: Si ingresa 4:
****
* *
* *
****
*/

//Full ayuda chatgpt

       int longitud; // si no defino longitud fuera del do, no lo encuentra en el while
       do { //probando la validacion con un do-while
            System.out.println("Ingrese la longitud del lado del cuadrado (minimo 2): ");
            longitud = Integer.parseInt(scanner.nextLine());
       } while (longitud < 2); 
       
       for (int fila = 0; fila < longitud; fila++){ // recorro las filas
           for (int columna = 0; columna < longitud; columna++){ //recorro las columnas
//si la fila es la primera o la ultima, en cada columna tiene que ir un *
//si son las filas del medio solo tiene que ir * en la primera y ultima columna
               if (fila == 0 /* primera */ || fila == longitud - 1 /* ultima */ || columna == 0 || columna == longitud -1){ 
                   System.out.print("*"); //si uso println me pone los * uno abajo del otro
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println(); // salto de linea despues de que termina de recorrer una fila
       }  
    }
}
