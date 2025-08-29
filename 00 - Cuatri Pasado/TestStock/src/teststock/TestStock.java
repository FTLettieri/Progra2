package teststock;

import Entidades.Producto;
import Entidades.Venta;

public class TestStock {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Fanta", 1499.99, 15);
        Venta venta1 = new Venta(producto1,10);
        Venta venta2 = new Venta(producto1,5);
        Venta venta3 = new Venta(producto1,2);
        

        if (venta1.realizarVenta()) {
            System.out.println("Detalle venta:");
            System.out.println(venta1.mostrarDetalle());
        }        
        System.out.println("Stock actualizado - " + producto1.mostrar());
         

        if (venta2.realizarVenta()) {
            System.out.println("Detalle venta:");            
            System.out.println(venta2.mostrarDetalle());
        }
        System.out.println("Stock actualizado - " + producto1.mostrar());
        

        if (venta3.realizarVenta()) {
            System.out.println("Detalle venta:");
            System.out.println(venta2.mostrarDetalle());
        }        
        System.out.println("Stock actualizado - " + producto1.mostrar());
    }
    
}
