package Entidades;

public class Marcador {
    private Equipo local;
    private Equipo visitante;
    private int puntosLocal;
    private int puntosVisitante;

    public Marcador(Equipo local, Equipo visitante) {
        this.local = local;
        this.visitante = visitante;
    }
    
    public void sumar(Equipo equipo, int puntos) {
 //       if (equipo.getNombre().equals(local.getNombre())) {
        if (equipo.sonIguales(local)) {
            this.puntosLocal += puntos;
//        } else if (equipo.getNombre().equals(visitante.getNombre())){
        } else if (equipo.sonIguales(visitante)){
            this.puntosVisitante += puntos;
        } else {
            System.out.println("Ese equipo no juega este partido");
        }
    }

    public int getPuntosLocal() {
        return this.puntosLocal;
    }

    public int getPuntosVisitante() {
        return this.puntosVisitante;
    }

    public Equipo getLocal() {
        return this.local;
    }

    public Equipo getVisitante() {
        return this.visitante;
    }
    
    
}
