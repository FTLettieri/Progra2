package Entidades;

public class Taladro extends Herramienta {
    private int rpm;
    private boolean inalambrico;

    public Taladro(String marca, int peso, int rpm, boolean inalambrico) {
        super(marca, peso);
        this.rpm = rpm;
        this.inalambrico = inalambrico;
    }

    public Taladro(int rpm, boolean inalambrico, String marca, int peso) {
        super(marca, peso);
        this.rpm = rpm;
        this.inalambrico = inalambrico;
    }
    
    public String mostrarTaladro(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.mostrarHerramienta());
        sb.append("RPM: ").append(this.rpm);
        sb.append(System.lineSeparator());
        sb.append("Inalambrico: ");
        if (this.inalambrico){
            sb.append("Si");
        } else {
            sb.append("No");
        }
        sb.append(System.lineSeparator());
        
        return sb.toString();
    }
    
    
    
    
    
}
