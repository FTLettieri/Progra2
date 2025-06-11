/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericsdepositos;
import Entidades.*;

/**
 *
 * @author franl
 */
public class GenericsDepositos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cocina c1 = new Cocina(111, 12300, false);
        Cocina c2 = new Cocina(112, 15000, true);
        Cocina c3 = new Cocina(113, 5600, false);
        Auto a1 = new Auto("Rojo", "Ferrari");
        Auto a2 = new Auto("Amarillo" ,"Porsche");
        Auto a3 = new Auto("Negro", "BMW");
        Auto a4 = new Auto("Verde", "Ford");
        Deposito<Cocina> dc = new Deposito<Cocina>(2);
        Deposito<Auto> da = new Deposito<Auto>(3);
        dc.agregar(c1);
        dc.agregar(c2);
        if (!(dc.agregar(c3)))
        {
            System.out.println("No se pudo agregar el item!!!");
        }

        if ((da.agregar(a1)))
        {
            System.out.println("Se ha agregado el item!!!");
        }
        da.agregar(a2);
        da.agregar(a3);
        if (!da.agregar(a4))
        {
            System.out.println("No se pudo agregar el item!!!");
        }
        System.out.println(dc);
        System.out.println(da);
        dc.remover(c2);
        if (!(dc.remover(c2)))
        {
            System.out.println("No se pudo remover el item!!!");
        }
        da.remover(a2);
        if (!(da.remover(a4)))
        {
            System.out.println("No se pudo remover el item!!!");
        }
        System.out.println(dc);
        System.out.println(da);
    }
    
}
