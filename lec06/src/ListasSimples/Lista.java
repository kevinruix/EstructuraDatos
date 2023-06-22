/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasSimples;


public class Lista {
    private Nodo cabeza;
    public void inserta(Persona p){
        if (cabeza==null){
            cabeza = new Nodo(p);
        }else if (p.getId()<cabeza.getDato().getId()){
            Nodo aux=new Nodo(p);
            aux.setNext(cabeza);
            cabeza=aux;
            
        } else if(cabeza.getNext()== null){
            cabeza.setNext(new Nodo(p));
            
        }
        Nodo aux = cabeza;
        
        while (aux.getNext()!=null && aux.getNext().getDato().getId()<p.getId()){
            aux=aux.getNext();
        }
        
    }
}
