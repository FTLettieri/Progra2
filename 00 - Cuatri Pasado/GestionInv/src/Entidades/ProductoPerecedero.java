/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author franl
 */
public class ProductoPerecedero extends Producto implements IVendible {
    private int stock;
    private boolean vencido;

    public ProductoPerecedero(String nombre, double precio, int stock) throws PrecioInvalidoException{
        super(nombre, precio);
        this.stock = stock;
        this.vencido = false;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setVencido(boolean vencido) {
        this.vencido = vencido;
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
