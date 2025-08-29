package Entidades;

import java.util.ArrayList;

public class JuegoAccion extends Juego{

    public JuegoAccion(String titulo, double pesoGB, ArrayList <TipoConsola> consolasCompatibles) {
        super(titulo, pesoGB);
        super.consolasCompatibles = consolasCompatibles;
       // super.consolasCompatibles.add(TipoConsola.PC);
       // super.consolasCompatibles.add(TipoConsola.PLAYSTATION);
    }
}
