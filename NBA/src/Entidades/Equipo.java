package Entidades;

public class Equipo {
    private String nombre;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean sonIguales(Equipo equipo) {
        return this.getNombre().equals(equipo.getNombre());
    }
    
    
    
}
