/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejestaticos;

public class Estadistica {
    static int llamadasMetodoA;
    static int llamadasMetodoB;
    static int llamadasMetodoC;
    
    static void metodoA(){
        Estadistica.llamadasMetodoA++;
    }
    static void metodoB(){
        Estadistica.llamadasMetodoB++;
    }
    
    static void metodoC(){
        Estadistica.llamadasMetodoC++;
    }
    
    static void mostrarResumen(){
        System.out.println("Metodo A: " + Estadistica.llamadasMetodoA + "\nMetodo B: " + Estadistica.llamadasMetodoB + "\nMetodo C: " +  Estadistica.llamadasMetodoC);
    }
}
