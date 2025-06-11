/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejestaticos;

public class Banco {
    static int saldoTotal;
    
    static void depositar(int monto){
        Banco.saldoTotal += monto;
        System.out.println("Saldo Actualizado: " + Banco.saldoTotal);
    }
    
    static void extraer(int monto){
        if (Banco.saldoTotal < monto) {
            System.out.println("Saldo insuficiente");
            System.out.println("Saldo Actual: " + Banco.saldoTotal);
        } else {
            Banco.saldoTotal-=monto;
            System.out.println("Saldo Actualizado: " + Banco.saldoTotal);
        }
    }
}
