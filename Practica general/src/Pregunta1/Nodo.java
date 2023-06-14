/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta1;

/**
 *
 * @author Kevin
 */
public class Nodo {
    private Persona contenido;
    private Nodo siguiente;//indispensable porque une los nodos. es el puntero

    public Nodo(Persona contenido) {
        this.contenido = contenido;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Persona getContenido() {
        return contenido;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
    @Override
    public String toString(){
        return "nombre "+contenido.getNombre()+" ID: "+contenido.getId()+" Discapacidad: "+contenido.getDisc()+"\n";
        
    }
}
