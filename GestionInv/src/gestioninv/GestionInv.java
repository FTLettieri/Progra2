
package gestioninv;
import Entidades.*;


public class GestionInv {

    public static void main(String[] args) {
        try {
                   ProductoPerecedero perecedero = new ProductoPerecedero("Leche", 1.50, 10);
                   ProductoNoPerecedero noPerecedero = new ProductoNoPerecedero("Lata de atún", 2.00, 5);

                   try {
                       perecedero.vender(3);  // venta válida
                       noPerecedero.vender(6);  // stock insuficiente
                   } catch (SinStockException e) {
                       System.err.println("Error de venta: " + e.getMessage());
                   } finally {
                       System.out.println("Intento de venta finalizado.\n");
                   }

               } catch (PrecioInvalidoException e) {
                   System.err.println("Error al crear producto: " + e.getMessage());
               }
    }
    
}
