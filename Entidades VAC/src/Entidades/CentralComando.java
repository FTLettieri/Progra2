/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

public class CentralComando {
    private static CentralComando instancia;
    private ArrayList<VehiculoAutonomo> vehiculos;
    
    // Método público para acceder a la única instancia
    public static CentralComando getInstancia() {
        if (instancia == null) {
            instancia = new CentralComando();
        }
        return instancia;
    }

    public CentralComando() {
        this.vehiculos = new ArrayList<>();
    }
    
    public void agregarVehiculo (VehiculoAutonomo vehiculo) {
        vehiculos.add(vehiculo);
    }
    
    public void operarVehiculos () {
        for (VehiculoAutonomo vehiculo : vehiculos) {
            vehiculo.moverse();
            vehiculo.detenerse();
            vehiculo.reportarEstado();

          if (vehiculo instanceof Dron){
              ((Dron) vehiculo).volar();
          }
        }
 
    }
}
