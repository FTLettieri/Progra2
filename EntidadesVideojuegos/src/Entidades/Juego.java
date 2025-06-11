package Entidades;

import java.util.ArrayList;

public class Juego {
    private String titulo;
    private double pesoGB;
    protected ArrayList<TipoConsola> consolasCompatibles;

    public Juego(String titulo, double pesoGB) {
        this.titulo = titulo;
        this.pesoGB = pesoGB;
        this.consolasCompatibles = new ArrayList <> ();
    }

    public String getTitulo() {
        return this.titulo;
    }

    public double getPesoGB() {
        return this.pesoGB;
    }

    public ArrayList<TipoConsola> getConsolasCompatibles() {
        return this.consolasCompatibles;
    }
    
    public String mostrarJuego(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Titulo: ").append(this.titulo); // dentro de la clase usar directamente el atributo
        sb.append(System.lineSeparator());
        sb.append("Peso (GBs): ").append(this.pesoGB);
        sb.append(System.lineSeparator());
        sb.append("Consolas compatibles: ");
        
        for (TipoConsola consola : this.consolasCompatibles) {
            sb.append(consola.getDesc()).append(", ");
        }
        sb.delete(sb.length()-2,sb.length());
        return sb.toString();
    }
    
    public boolean esCompatible(TipoConsola consola){
        return consolasCompatibles.contains(consola);
        }
}
