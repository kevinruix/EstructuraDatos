/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta1;

/**
 *
 * @author Kevin
 */
public class Cola {
    private Nodo frente;
    private Nodo ultimo;
    
    private boolean isEmpty(){
        return frente==null;
    }
    public void insertar(int Id, String nombre, Discapacidad disc){
        Persona p1= new Persona(Id,nombre,disc);
        Nodo nuevo = new Nodo(p1);
        if(isEmpty() ){
            frente = nuevo;
            ultimo= nuevo;
            
        }else{
            if(nuevo.getContenido().getDisc()==Discapacidad.Si){
                nuevo.setSiguiente(frente);
                frente = nuevo;
            }else{
                ultimo.setSiguiente(nuevo);// el nuevo sale despues del nodo ultimo
                ultimo = nuevo;
                
            }
            
        }
    }
    public void atender(){
        if(isEmpty()){
            System.out.println("La fila esta vacia");
            
        }else{
            frente = frente.getSiguiente();
                
    }
    }
    public void mostrar(){
        if(isEmpty()){
            System.out.println("La fila esta vacia.");
        }else{
            Nodo aux = frente;
            while(aux!=null){//con esto no me preocupo si no hay tercera persona porque lo cubre
                if(aux==frente.getSiguiente().getSiguiente()){
                    System.out.println("Felicidades "+aux.getContenido().getNombre()+" se gano un premio!");
                    
                }
                System.out.println(aux.toString());
                aux = aux.getSiguiente();// para que no se encicle
                
        }
    }
    }
}
