/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec04;


public class Rutinas {
  private NodoC atras;
private Cola cola1;
 private NodoC frente;
    private NodoC ultimo;

public void encola(NodoC n){
     if (frente==null){
            frente=n;
            ultimo=n;
        }else {
            ultimo.setAtras(n);
            ultimo=n;
        }
}
public boolean encuentra(int x){
    if(ultimo!=null){
       return false;
    }else{
        return true;
    }
}
public void extrae(int x){
    
}  
 public NodoC ordena() {
        NodoC aux=frente;
        if (frente!=null){
            frente=frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }
}
