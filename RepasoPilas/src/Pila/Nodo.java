/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;


public class Nodo {
    private TipoMoneda valor;
    private Nodo next;

    public Nodo(TipoMoneda valor) {
        this.valor = valor;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public TipoMoneda getValor() {
        return valor;
    }

    public Nodo getNext() {
        return next;
    }
    
    
    
}
