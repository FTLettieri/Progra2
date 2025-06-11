package Entidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class procesadorArchivos implements IArchivo {

    @Override
    public ArrayList<Empleado> leerEmpleados(String rutaArchivo) throws archivoIncompletoException {
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        // Leer el CSV
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] columnas = linea.split(",");
                
                //si no tengo todos los datos tiro una excepcion
                if (columnas.length < 4) {
                    throw new archivoIncompletoException("Fila incompleta: " + linea);
                }
                
                //divido los campos en variables                
                String tipoEmpleado = columnas[0].trim();
                String nombreEmpleado = columnas[1].trim();
                double sueldoBase = Double.parseDouble(columnas[2].trim());
                int horasExtra = Integer.parseInt(columnas[3].trim());
                
                //Depende del tipo empleado creo uno u otro y lo agrego a la lista
                if (tipoEmpleado.equalsIgnoreCase("tiempo_completo")){
                    empleados.add(new EmpleadoTiempoCompleto(nombreEmpleado, sueldoBase, horasExtra));
                } else if (tipoEmpleado.equalsIgnoreCase("medio_tiempo")){
                    empleados.add(new EmpleadoTiempoParcial(nombreEmpleado, sueldoBase));
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el CSV: " + e.getMessage());
        }        
        
        return empleados;
    }

    @Override
    public void escribirReporte(String rutaArchivo, ArrayList<Empleado> empleados) {
        try (
            PrintWriter pw = new PrintWriter(new FileWriter(rutaArchivo))
        ) {
                pw.printf("%-20s %-20s %-20s%n", "Nombre", "Tipo", "Sueldo Final");
                pw.println("--------------------------------------------------------------");
                
                for (Empleado empleado : empleados) {
                    pw.printf("%-20s %-20s $%-20.2f%n", empleado.getNombre(), empleado.getTipo(), empleado.calcularSueldo());
            }

        } catch (IOException e) {
            System.err.println("Error al leer o escribir: " + e.getMessage());
        }

    }
 
}
