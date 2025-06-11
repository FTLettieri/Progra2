/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;

public class Museo {
    private int capacidad;
    private ArrayList<ObraArte> obras;

    public Museo() {
        this.capacidad = 3;
        this.obras = new ArrayList<>();
    }

    public Museo(int capacidad) {
        this();
        this.capacidad = capacidad;     
    }
    

    public void agregar(ObraArte obra){
        //me falto comparar si ya existia la obra
        if (obras.size() < this.capacidad) {
                if (sonIguales(obra)){
                    System.out.println("La obra ya existe");
   
                } else {
                    obras.add(obra);
                    System.out.println("Obra agregada"); 
                }
         }else{
            System.out.println("No hay lugar");

        } 

    }
    
       public boolean sonIguales(ObraArte obra) {
           return this.obras.contains(obra);
       }
    
    /*
    public boolean sonIguales(ObraArte obra) {
        boolean retorno = false;
        for (ObraArte obras : obras) {
            if (ObraArte.sonIguales(obras, obra))
                retorno = true;
        }
        return retorno;
    }*/
    
    private double getValor(TipoValor tipoValor){
        double valorTotal = 0.0;
        for (ObraArte obra : obras) {
            switch (tipoValor) {
                    case PINTURAS:
                        if (obra instanceof Pintura){
                            valorTotal += (((Pintura) obra).getValorComercial());
                        }
                    case ESCULTURAS:
                        if (obra instanceof Escultura){
                            valorTotal += (((Escultura) obra).getValorComercial());
                        }
                    case TODAS:
                        if (obra instanceof Pintura){
                            valorTotal += (((Pintura) obra).getValorComercial());
                        }
                        if (obra instanceof Escultura){
                            valorTotal += (((Escultura) obra).getValorComercial());
                        }                       
            }           
        }
        return valorTotal;  
    }
    
    public void ordenar(){
        Collections.sort(obras);
    }
    
    public double getValorDePinturas(){
        return this.getValor(TipoValor.PINTURAS);
    }
    public double getValorDeEsculturas(){
        return this.getValor(TipoValor.ESCULTURAS);
    }
    public double getValorTotal(){
        return this.getValor(TipoValor.TODAS);
    }
    
    public static String mostrar(Museo museo){
        StringBuilder sb = new StringBuilder();
        sb.append("Capacidad del museo: ").append(museo.capacidad);
        sb.append(System.lineSeparator());
        sb.append(System.lineSeparator());
        sb.append("Obras: ");
        sb.append(System.lineSeparator());        
        for (ObraArte obra : museo.obras) {
               sb.append(obra);
               sb.append(System.lineSeparator());
        }
       
        return sb.toString();
    }
}
