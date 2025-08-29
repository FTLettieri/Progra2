package Entidades;

public abstract class Empleado {
    private String nombre;
    private double sueldoBase;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldoBase = sueldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getSueldoBase() {
        return this.sueldoBase;
    }
    
    public abstract double calcularSueldo();
    
    public abstract String getTipo();
    
}
