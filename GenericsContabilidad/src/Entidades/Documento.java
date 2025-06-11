/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author franl
 */
public abstract class Documento {
    private int numero;

    public Documento(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }
    
    

}
