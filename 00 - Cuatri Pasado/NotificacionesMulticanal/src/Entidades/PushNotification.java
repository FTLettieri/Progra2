/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class PushNotification extends Notificacion {

    public PushNotification(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Notificacion enviada a " + this.destinatario);
        System.out.println("");
    }

    @Override
    public void formatearMensaje() {
        System.out.println("Formateando mensaje para notif push: " + this.mensaje);
    }
    
    public void validarToken(){
        System.out.println("Validando token....");
        System.out.println("...");
        System.out.println("Token validado");
    }
    
    
}
