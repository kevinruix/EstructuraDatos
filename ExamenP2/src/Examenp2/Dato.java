/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examenp2;
public class Dato {
    
    private int id;
    private String letra;

    public Dato(int id, String letra) {
        this.id = id;
        this.letra = letra;
    }
    
    public Dato(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return letra;
    }

    public void setNombre(String nombre) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return " Dato: " + " id = " + id + " letra = " + letra + "\n";
    }
    
  
}