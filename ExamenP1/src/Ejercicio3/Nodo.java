/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;


public class Nodo {
   private Suma valor;
    private Nodo next;

    public Nodo(Suma valor) {
        this.valor = valor;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Suma getValor() {
        return valor;
    }

    public Nodo getNext() {
        return next;
    }
}

