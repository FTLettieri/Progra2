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
public class Deposito<T> {
    private int capacidadMaxima;
    private ArrayList<T> lista;

    public Deposito(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        lista = new ArrayList<>();
    }
    
    private int getIndice(T elemento){
        int indice = 0;
        for (T t : lista) {
            if (t.equals(elemento)){
                return indice;
            }
        }
        return -1;
    }
    
    public boolean agregar(T elemento){
        boolean retorno = false;
        
        if (lista.size() < capacidadMaxima && this.getIndice(elemento) == -1){
            lista.add(elemento);
            retorno = true;
        }         
        return retorno;
    }
    
    public boolean remover(T elemento){
        boolean retorno = false;
        if (this.getIndice(elemento) >= 0){
            lista.remove(elemento);
            retorno = true;
        }
        return retorno;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Capacidad del deposito: ").append(this.capacidadMaxima).append(System.lineSeparator());
        sb.append("Contenido del depósito:\n");
        for (T obj : lista) {
            sb.append(obj.toString()).append("\n");
        }
        return sb.toString();
    }
    
}
