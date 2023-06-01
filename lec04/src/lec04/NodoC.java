/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec04;


public class NodoC {
   private String dato;
private NodoC atras;

public String getDato() {return dato;}
public void setDato(String dato){ this.dato=dato;}

public NodoC getAtras() { return atras;}
public void setAtras(NodoC atras) {this.atras = atras;}

public NodoC(String dato) { this.dato = dato;}
public NodoC(){}

@Override
public String toString(){ return dato;}
}
