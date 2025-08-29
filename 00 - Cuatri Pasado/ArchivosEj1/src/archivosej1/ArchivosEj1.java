/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivosej1;

import java.nio.file.Path;
import java.nio.file.Paths;
import Entidades.*;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author franl
 */
public class ArchivosEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path rutaArchivos = Paths.get(System.getProperty("user.home"), "Documents");
        String archivoEmpleados = rutaArchivos + File.separator + "empleados.csv";
        String archivoReporte = rutaArchivos + File.separator + "reporte.txt";
        
        procesadorArchivos procesador = new procesadorArchivos();
        
        try {
            ArrayList<Empleado> empleados = procesador.leerEmpleados(archivoEmpleados);
            procesador.escribirReporte(archivoReporte, empleados);
            System.out.println("Se genero el reporte");
        } catch (archivoIncompletoException e){
            System.err.println("Error al leer archivo: " + e.getMessage());
        }
    
    }
    
}
