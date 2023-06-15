/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;


public class Pila01 {
    private Nodo cima;
    
    private boolean pilaVacia(){
        return cima==null;
        
    }
    
    public void ingresar(Suma num){
        if(pilaVacia()){
            cima = new Nodo(num);
            
        }else{
            Nodo nuevo = new Nodo(num);
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
