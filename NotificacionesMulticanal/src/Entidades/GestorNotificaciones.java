/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author franl
 */
public class GestorNotificaciones {
    private static GestorNotificaciones instancia;
    private ArrayList<Notificacion> notificaciones;
    
    public GestorNotificaciones() {
        this.notificaciones = new ArrayList<>();
    }

    // Método público para acceder a la única instancia
    public static GestorNotificaciones getInstancia() {
        if (instancia == null) {
            instancia = new GestorNotificaciones();
        }
        return instancia;
    }    
    public void agregarNotificacion(Notificacion notif){
        this.notificaciones.add(notif);
    }
    
    public void enviarMensajes(){
        for (Notificacion notificacion : notificaciones) {
            
            if (notificacion instanceof PushNotification){
                ((PushNotification) notificacion).validarToken();
            }      
            
            notificacion.formatearMensaje();
            notificacion.enviar();

        }
    }
}
