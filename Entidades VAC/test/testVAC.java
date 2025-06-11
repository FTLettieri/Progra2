import Entidades.*;
public class testVAC {

    public static void main(String[] args) {
        CentralComando comando = CentralComando.getInstancia();
        
        comando.agregarVehiculo(new Auto(1, "Audi", "A3"));
        comando.agregarVehiculo(new Camion(2, "Scania", "JSSDG#12"));
        comando.agregarVehiculo(new Dron(3, "Gadnic", "Fire345"));
        
        comando.operarVehiculos();
    }
    
}
