package Entidades;

public class EmpleadoTiempoCompleto extends Empleado {
    
    private int horasExtra;

    public EmpleadoTiempoCompleto(String nombre, double sueldo) {
        super(nombre, sueldo);
        this.horasExtra = 0;
    }
    
    public EmpleadoTiempoCompleto(String nombre, double sueldo, int horasExtra) {
        this(nombre, sueldo);
        this.horasExtra = horasExtra;
    }

    public int getHorasExtra() {
        return horasExtra;
    }
    
    
    @Override
    public double calcularSueldo() {
        return this.getSueldoBase() + this.getHorasExtra() * ((this.getSueldoBase() / (172/2)));
    }

    @Override
    public String getTipo() {
        return "Tiempo completo";
    }
    
    
    
}
