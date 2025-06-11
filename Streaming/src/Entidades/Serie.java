package Entidades;

public class Serie extends Contenido{
    private int cantEpisodios;
    private int duracionPorEpisodio;

    public Serie(int cantEpisodios, int duracionPorEpisodio, String titulo) {
        super(titulo);
        this.cantEpisodios = cantEpisodios;
        this.duracionPorEpisodio = duracionPorEpisodio;
    }
    
    public Serie(String titulo, int cantEpisodios, int duracionPorEpisodio) {
        super(titulo);
        this.cantEpisodios = cantEpisodios;
        this.duracionPorEpisodio = duracionPorEpisodio;
    }

    @Override
    public void reproducir() {
        System.out.println("El capitulo esta empezando...");
    }

    @Override
    public int obtenerDuracion() {
        return this.duracionPorEpisodio * this.cantEpisodios;
    }
    
    
}
