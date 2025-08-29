package Entidades;

public class LlaveInglesa extends Herramienta{
    private TipoMaterial material;
    private boolean regulable;

    public LlaveInglesa(TipoMaterial material, boolean regulable, String marca, int peso) {
        super(marca, peso);
        this.material = material;
        this.regulable = regulable;
    }
    
    public LlaveInglesa(String marca, int peso, TipoMaterial material, boolean regulable) {
        super(marca, peso);
        this.material = material;
        this.regulable = regulable;
    }
    
    public String mostrarLlaveInglesa(){     
        StringBuilder sb = new StringBuilder ();
        
        sb.append(super.mostrarHerramienta());
        sb.append("Material: ").append(this.material.getDesc());
        sb.append(System.lineSeparator());
        sb.append("Regulable: ");
        if (this.regulable) {
            sb.append("Si");
        } else {
            sb.append("No");
        }
        sb.append(System.lineSeparator());
        
        return sb.toString();
    }
}
