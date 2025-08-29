/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejestaticos;

public class EjEstaticos {

    public static void main(String[] args) {
        Contador.incrementar();
        System.out.println(Contador.cantidad);
        Contador.incrementar();
        System.out.println(Contador.cantidad);        
        Contador.incrementar();
        System.out.println(Contador.cantidad);        
        Contador.incrementar();
        System.out.println(Contador.cantidad);
        
        Conversor.convertirMtsAKms(10000);
        System.out.println(Conversor.kilometros);
        
        Estadistica.metodoA();
        Estadistica.metodoB();
        Estadistica.metodoA();
        Estadistica.metodoC();
        Estadistica.metodoA();
        Estadistica.metodoB();
        Estadistica.metodoB();
        Estadistica.metodoC();
        Estadistica.metodoA();
        Estadistica.mostrarResumen();
        
        
        Banco.depositar(500);
        Banco.depositar(200);
        Banco.depositar(600);
        Banco.extraer(2000);
        Banco.extraer(1000);
        Banco.depositar(50);
        
        
        Sesion.login("Fran");
        Sesion.mostrarEstado();
        Sesion.login("Xoa");
        Sesion.mostrarEstado();
        Sesion.logout();
        Sesion.mostrarEstado();
        Sesion.login("Xoa");
        Sesion.mostrarEstado();
        
    }
    
}
