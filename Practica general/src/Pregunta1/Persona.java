/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta1;

/**
 *
 * @author Kevin
 */
public class Persona {
    private int Id;
    private String nombre;
    private Discapacidad disc;
    
    public Persona(int Id, String nombre, Discapacidad disc) {
        this.Id = Id;
        this.nombre = nombre;
        this.disc = disc;
    }

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return nombre;
    }

    public Discapacidad getDisc() {
        return disc;
    }
    
}
