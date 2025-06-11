package Enumeradores;

public class Pedido {
    
    private String Cliente;
    private Bebida bebidaElegida;

    public Pedido(String Cliente, Bebida bebidaElegida) {
        this.Cliente = Cliente;
        this.bebidaElegida = bebidaElegida;
    }
    
    public boolean esBebidaFria(){
        boolean retorno = false;
        if (bebidaElegida.getTipo().equals("Fria")) {
            retorno = true;
            }
        return retorno;
        }
}


