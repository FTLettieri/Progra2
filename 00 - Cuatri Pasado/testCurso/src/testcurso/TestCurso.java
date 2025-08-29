
package testcurso;

import Entidades.Alumno;
import Entidades.Curso;


/**
 *
 * @author franl
 */
public class TestCurso {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Francisco", "Lettieri", 17);
        Alumno alumno2 = new Alumno("Xoana", "Gimenez", 18);
        Curso programacion = new Curso("Programacion II", 40);
        
        programacion.setAlumno(alumno1);
        System.out.println(programacion.mostrarInfo());
        
        programacion.setAlumno(alumno2);
        System.out.println(programacion.mostrarInfo()); //hay que limpiar para que no se muestre el mismo 2 veces
    }
    
}
