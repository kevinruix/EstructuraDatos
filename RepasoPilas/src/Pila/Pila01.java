/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

/**
 *
 * @author Kevin
 */
public class Pila01 {
    private Nodo cima;
    
    private boolean pilaVacia(){
        return cima==null;
        
    }
    
    public void ingresar(TipoMoneda moneda){
        if(pilaVacia()){
            cima = new Nodo(moneda);
            
        }else{
            Nodo nuevo = new Nodo(moneda);
            nuevo.setNext(cima);
            cima = nuevo;
            
        }
    }
    @Override
    public String toString(){
        String s = "";
        if(pilaVacia()){
            return "Pila Vacia";
        }else{
            
            Nodo aux = cima;
            while(aux!=null){
                s += aux.getValor()+"---";
                aux = aux.getNext();
                
            }
        }
        return s;
    }
    
}
