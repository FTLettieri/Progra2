package Entidades;

public abstract class Contenido {
    protected String titulo;

    public Contenido(String titulo) {
        this.titulo = titulo;
    }
        
    public abstract void reproducir();
    public abstract int obtenerDuracion();
}
