package Entidades;

import java.util.ArrayList;

public class JuegoDeportes extends Juego{

    public JuegoDeportes(String titulo, double pesoGB, ArrayList <TipoConsola> consolasCompatibles) {
        super(titulo, pesoGB);
        super.consolasCompatibles = consolasCompatibles;
       // super.consolasCompatibles.add(TipoConsola.XBOX);
        //super.consolasCompatibles.add(TipoConsola.PLAYSTATION);
    }
    
    
}
