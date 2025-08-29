
package Entidades;

public enum TipoMaterial {
    ACERO("Acero"),
    TITANIO("Titanio"),
    ALUMINIO("Aluminio"),
    HIERRO("Hierro"),
    CROMO_VANIDIO("Cromo Vanidio"),
    FIBRA_CARBONO("Fibra de Carbono");
    
    private String desc;

    private TipoMaterial(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
    
}
