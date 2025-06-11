package testvideojuegos;

import Entidades.*;
import java.util.ArrayList;

public class TestVideojuegos {

    public static void main(String[] args) {
        ArrayList<TipoConsola> consolasDeportivo = new ArrayList <>();
        ArrayList<TipoConsola> consolasAccion = new ArrayList <>();
        consolasAccion.add(TipoConsola.PLAYSTATION);
        consolasAccion.add(TipoConsola.PC);
        consolasDeportivo.add(TipoConsola.PLAYSTATION);
        consolasDeportivo.add(TipoConsola.XBOX);
        
        JuegoAccion ja1 = new JuegoAccion("Warzone", 750,consolasAccion);
        JuegoAccion ja2 = new JuegoAccion("TLOU", 350,consolasAccion);
        JuegoDeportes jd1 = new JuegoDeportes("EA FC 25", 200,consolasDeportivo);
        
        Consola c1 = new Consola("PlayFran", TipoConsola.PLAYSTATION, 990);
        Consola c2 = new Consola("XboxFran", TipoConsola.XBOX, 490);
        Consola c3 = new Consola("PCFran", TipoConsola.PC, 750);
        
        // Prueba PS
        System.out.println("PS");
        if (c1.agregarJuego(ja1)) {
            System.out.println("Se instalo el juego " + ja1.getTitulo());
        } else {
            System.out.println(ja1.getTitulo() + " no instalado");
        }
        if (c1.agregarJuego(ja2)) {
            System.out.println("Se instalo el juego " + ja2.getTitulo());
        } else {
            System.out.println(ja2.getTitulo() + " no instalado");
        }
        if (c1.agregarJuego(jd1)) {
            System.out.println("Se instalo el juego " + jd1.getTitulo());
        } else {
            System.out.println(jd1.getTitulo() + " no instalado");
        }
        System.out.println("");
        System.out.println("Juegos instalados en " + c1.getNombre());
        c1.mostrarJuegos();
                
        // Prueba Xbox
        System.out.println("");
        System.out.println("Xbox");
        if (c2.agregarJuego(ja1)) {
            System.out.println("Se instalo el juego " + ja1.getTitulo());
        } else {
            System.out.println(ja1.getTitulo() + " no instalado");
        }
        if (c2.agregarJuego(ja2)) {
            System.out.println("Se instalo el juego " + ja2.getTitulo());
        } else {
            System.out.println(ja2.getTitulo() + " no instalado");
        }
        if (c2.agregarJuego(jd1)) {
            System.out.println("Se instalo el juego " + jd1.getTitulo());
        } else {
            System.out.println(jd1.getTitulo() + " no instalado");
        } 
        System.out.println("");
        System.out.println("Juegos instalados en " + c2.getNombre());
        c2.mostrarJuegos();
        
        // Prueba PC
        System.out.println("");
        System.out.println("PC");        
        if (c3.agregarJuego(ja1)) {
            System.out.println("Se instalo el juego " + ja1.getTitulo());
        } else {
            System.out.println(ja1.getTitulo() + " no instalado");
        }
        if (c3.agregarJuego(ja2)) {
            System.out.println("Se instalo el juego " + ja2.getTitulo());
        } else {
            System.out.println(ja2.getTitulo() + " no instalado");
        }
        if (c3.agregarJuego(jd1)) {
            System.out.println("Se instalo el juego " + jd1.getTitulo());
        } else {
            System.out.println(jd1.getTitulo() + " no instalado");
        }
        System.out.println("");
        System.out.println("Juegos instalados en " + c3.getNombre());
        c3.mostrarJuegos();
        
        
        
        
    }
    
}
