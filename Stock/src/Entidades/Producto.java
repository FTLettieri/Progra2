/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author franl
 */
public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    
    public String mostrar(){
        return "Producto: " + this.nombre + ". Precio: " + this.precio + ". Stock: " + this.stock;
    }
    
    private boolean tieneStockDisponible(int stockProducto){
        //return this.stock >= stockProducto
        return stockProducto>0;
    }
    
    public void reducirStock(int cantidadVendida){
        //if (this.stock >= cantidadVendida)
        if (this.tieneStockDisponible(this.stock) == true){ 
            this.stock -= cantidadVendida;
        }
    }
}
