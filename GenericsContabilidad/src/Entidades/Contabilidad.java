/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author franl
 */
public class Contabilidad<T extends Documento,U extends Documento> {
    private ArrayList<U> ingresos;
    private ArrayList<T> egresos;
    
    public Contabilidad(){
        this.ingresos = new ArrayList<>();
        this.egresos = new ArrayList<>();
    }
    
    
    public static <T extends Documento, U extends Documento> void agregarE(Contabilidad<T, U> contabilidad, T egreso) {
        contabilidad.egresos.add(egreso);
    }

    public static <T extends Documento, U extends Documento> void agregarI(Contabilidad<T, U> contabilidad, U ingreso) {
        contabilidad.ingresos.add(ingreso);
    }

    public void mostrarEgresos() {
    System.out.println("Egresos:");
    for (T doc : egresos) {
            System.out.println(doc.getNumero());
        }
    }

public void mostrarIngresos() {
    System.out.println("Ingresos:");
    for (U doc : ingresos) {
        System.out.println(doc.getNumero());
        }
    }
}
