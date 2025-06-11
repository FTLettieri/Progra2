
package notificacionesmulticanal;

import Entidades.*;

/**
 *
 * @author franl
 */
public class NotificacionesMulticanal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorNotificaciones gestor = GestorNotificaciones.getInstancia();
        Email m1 = new Email("Fran","Este es un mail");
        SMS s1 = new SMS("Xoa", "Este es un SMS");
        PushNotification p1 = new PushNotification("Santi", "Mandame la plani");
        
        gestor.agregarNotificacion(m1);
        gestor.agregarNotificacion(s1);
        gestor.agregarNotificacion(p1);
        
        gestor.enviarMensajes();
        
    }
    
}
