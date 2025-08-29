/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author franl
 */
public class Venta {
    private Producto producto;
    private int cantidadVendida;

    public Venta(Producto producto, int cantidadVendida) {
        this.producto = producto;
        this.cantidadVendida = cantidadVendida;
    }

    public double getPrecioTotal() {
        return this.cantidadVendida * producto.getPrecio();
    }
    
    public boolean realizarVenta(){
        boolean ventaCompletada = false;
        if (this.cantidadVendida <= producto.getStock()){
            producto.reducirStock(this.cantidadVendida);
            ventaCompletada = true;
        } else {
            System.out.println("Stock Insuficiente, no se puede realizar la venta");
        }
        return ventaCompletada;
    }
    
    public String mostrarDetalle(){
        return "Producto: " + producto.getNombre() + ". Cant vendida: " + this.cantidadVendida + ". Precio total: " + this.getPrecioTotal();
    }
    
}
