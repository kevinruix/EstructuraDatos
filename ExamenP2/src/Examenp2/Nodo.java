/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examenp2;
public class Nodo {
        
    private Dato dato;
    private Nodo next;
    private Nodo back;
    
    public Nodo getBack(){
        return back;
    }
    
    public void setBack(Nodo back){
        this.back = back;
    }

    @Override
    public String toString() {
        return "" + " Datos de Persona: " + dato;
    }

    public Nodo(Dato dato) {
        this.dato = dato;
    }

    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
}