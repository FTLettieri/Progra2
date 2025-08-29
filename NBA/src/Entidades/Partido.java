package Entidades;

import java.util.Random;

public class Partido {
    private Marcador marcador;
    private RelojPartido reloj;
//    private Random random = new Random();
    private Random random;
    
    private static final int FALLO = 0;
    private static final int DOBLE = 2;
    private static final int TRIPLE = 3;

    public Partido(Equipo local, Equipo visitante, Random rnd) {
        this.marcador = new Marcador(local, visitante);
        this.reloj = new RelojPartido();
        this.random = rnd;
    }
    
    private int resultadoAleatorio() {
        int resultadoJugada = random.nextInt(3);
        
        if (resultadoJugada == 1) {
            resultadoJugada = 3;
        }      
        return resultadoJugada;
    }
    
    private String simularJugada(Equipo equipo){
        int puntajeJugada = resultadoAleatorio();
        String resultadoJugada;
        switch (puntajeJugada) {
            case FALLO:
                resultadoJugada = "fallo de " + equipo.getNombre();
                break;
            case DOBLE:
                resultadoJugada = "doble de " + equipo.getNombre();
                marcador.sumar(equipo, DOBLE);
                break;
            default: 
                resultadoJugada = "triple de " + equipo.getNombre();
                marcador.sumar(equipo, TRIPLE);
                break;
        }
        return resultadoJugada;
    }
    
    private void imprimirJuego(String jugada){
        System.out.println("Min " + String.format("%02d",reloj.getMinutosDelCuarto()) + ":" + String.format("%02d",reloj.getSegundosDelCuarto()) + " " + reloj.getCuarto() + "   -   " + marcador.getLocal().getNombre() + " " + marcador.getPuntosLocal() + "  -  " + marcador.getPuntosVisitante() + " " + marcador.getVisitante().getNombre() + "     " + jugada);
    }
    private void imprimirPos(Equipo equipo){
        System.out.println("Min " + String.format("%02d",reloj.getMinutosDelCuarto()) + ":" + String.format("%02d",reloj.getSegundosDelCuarto()) + " " + reloj.getCuarto() + "   -   " + marcador.getLocal().getNombre() + " " + marcador.getPuntosLocal() + "  -  " + marcador.getPuntosVisitante() + " " + marcador.getVisitante().getNombre() + "     " + "posicion de " + equipo.getNombre());
    }
    
    private void simularTiempo() throws InterruptedException{
        Thread.sleep(1000);
    }
    
    public void jugar(int segs) throws InterruptedException{
        boolean turnoLocal = true;
        
        System.out.println("Comienza el partido");
        while (!reloj.finalizoTiempoRegular()) {
            if (turnoLocal) {
                simularTiempo();
                imprimirPos(marcador.getLocal());
                reloj.avanzarSegundos(segs);
                simularTiempo();
                imprimirJuego(simularJugada(marcador.getLocal()));
                reloj.avanzarSegundos(10);
                turnoLocal = false;
            } else {
                simularTiempo();
                imprimirPos(marcador.getVisitante());
                reloj.avanzarSegundos(segs);
                simularTiempo();
                imprimirJuego(simularJugada(marcador.getVisitante()));               
                reloj.avanzarSegundos(10);
                turnoLocal = true;
            }           
        }
        System.out.println("Finaliza el partido");
    }
}
