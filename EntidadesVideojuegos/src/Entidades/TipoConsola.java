package Entidades;

public enum TipoConsola {
    PLAYSTATION("PlayStation"),
    XBOX("Xbox"),
    PC("PC");
    
    private String desc;

    private TipoConsola(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

}
