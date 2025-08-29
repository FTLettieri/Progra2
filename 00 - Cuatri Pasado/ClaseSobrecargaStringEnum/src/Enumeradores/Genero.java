/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enumeradores;

public enum Genero {
    FICCION("Ficcion"),
    NO_FICCION("No Ficcion"),
    POESIA("Poesia"),
    ENSAYO("Ensayo"),
    INFANTIL("Literatura Infantil");
    
    private String desc;
    
    private Genero(String desc){
        this.desc = desc;
    }
    
    public String getDesc(){
        return this.desc;
    }
    
}
