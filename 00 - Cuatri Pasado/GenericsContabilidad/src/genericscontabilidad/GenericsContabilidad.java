package genericscontabilidad;
import Entidades.*;

public class GenericsContabilidad {

    public static void main(String[] args) {
 // Crear una contabilidad con egresos = Factura y ingresos = Recibo
        Contabilidad<Factura, Recibo> contabilidad = new Contabilidad<>();
        Contabilidad<Factura, Recibo> contabilidad2 = new Contabilidad<>();

        // Crear documentos
        Factura f1 = new Factura(1001);
        Factura f2 = new Factura(1002);

        Recibo r1 = new Recibo(2001);
        Recibo r2 = new Recibo(2002);

        // Agregar a contabilidad
        Contabilidad.agregarE(contabilidad, f1);
        Contabilidad.agregarE(contabilidad, f2);
        Contabilidad.agregarE(contabilidad2, f2);

        Contabilidad.agregarI(contabilidad, r1);
        Contabilidad.agregarI(contabilidad2, r1);
        Contabilidad.agregarI(contabilidad, r2);

        // Mostrar contenido
        System.out.println("=== CONTABILIDAD ===");
        contabilidad.mostrarEgresos();
        contabilidad.mostrarIngresos();
        contabilidad2.mostrarEgresos();
        contabilidad2.mostrarIngresos();
    }
    
}
