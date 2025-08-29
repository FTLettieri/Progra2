/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

public interface IArchivo {
    ArrayList<Empleado> leerEmpleados(String rutaArchivo) throws archivoIncompletoException;
    void escribirReporte(String ruta, ArrayList<Empleado> empleados);

}
