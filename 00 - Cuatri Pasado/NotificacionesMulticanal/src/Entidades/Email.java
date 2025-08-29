/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class Email extends Notificacion {

    public Email(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Se envio el Email a " + this.destinatario);
        System.out.println("");        
    }

    @Override
    public void formatearMensaje() {
        System.out.println("Formateando mensaje para Email: " + this.mensaje);
    }
    
    
}
