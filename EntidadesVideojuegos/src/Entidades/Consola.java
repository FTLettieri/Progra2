package Entidades;

import java.util.ArrayList;

public class Consola {
    private String nombre;
    private TipoConsola tipo;
    private double capacidadMaximaGB;
    private ArrayList <Juego> juegosInstalados;

    public Consola(String nombre, TipoConsola tipo, double capacidadMaximaGB) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidadMaximaGB = capacidadMaximaGB;
        this.juegosInstalados = new ArrayList <>();
    }

    public String getNombre() {
        return this.nombre;
    }
     
    public boolean agregarJuego(Juego juego) {
        double capacidadOcupada = 0; 
        boolean retorno = false;
        
        for (Juego juegoInstalado : juegosInstalados ) {
            capacidadOcupada += juegoInstalado.getPesoGB();
        }
        
        if (juego.esCompatible(this.tipo) && juego.getPesoGB() <= (capacidadMaximaGB - capacidadOcupada) ){
            this.juegosInstalados.add(juego);
            retorno = true;
        }
        return retorno;
    }
   /* 
    public String mostrarJuegos(){
        StringBuilder sb = new StringBuilder ();
        for (Juego juegoInstalado : juegosInstalados) {
            sb.append(juegoInstalado.mostrarJuego());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    } */
    
    public void mostrarJuegos(){
        for (Juego juegoInstalado : juegosInstalados) {
            System.out.println(juegoInstalado.mostrarJuego());
        }
    }
    
}
