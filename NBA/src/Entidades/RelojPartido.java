package Entidades;

public class RelojPartido {
    private int cuarto; 
    private int minutos; 
    private int segundos; 

    public RelojPartido() {
        this.cuarto = 1;
        this.minutos = 0;
        this.segundos = 0;
    }
    
    public void avanzarSegundos(int segundos) {
        if (segundos > 0 && segundos < 60){
            this.segundos += segundos;
        }
        
        if (this.segundos >= 60) {
            this.minutos += 1;
            this.segundos -= 60;
        }
        
        if (this.minutos == 12) {
            this.cuarto += 1;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    public String getCuarto() {
        String retorno = "1er Cuarto";
        if (this.cuarto == 2){
            retorno = "2do Cuarto";
        } else if (this.cuarto == 3) {
            retorno = "3er Cuarto";
        } else if (this.cuarto == 4){
            retorno = "4to Cuarto";
        }
        return retorno;
    }

    public int getMinutosDelCuarto() {
        return this.minutos;
    }

    public int getSegundosDelCuarto() {
        return this.segundos;
    }
    
    public boolean finalizoTiempoRegular(){
        return this.cuarto > 5;
    }
    
}
