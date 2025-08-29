/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class ProductoNoPerecedero extends Producto implements IVendible {
    private int stock;

    public ProductoNoPerecedero(String nombre, double precio, int stock) throws PrecioInvalidoException {
        super(nombre, precio);
        this.stock = stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return this.stock;
    }

    @Override
    public void vender(int cantidad) {
        if (cantidad > this.getStock()) {
            throw new SinStockException("No hay stock suficiente");
        } else {
            System.out.println("Precio total: " + this.precio * cantidad);
        }

    }
    
}
