/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarealistacirculardoble;

/**
 *
 * @author jenns
 */
public class Lista {
        
    private Nodo cabeza;
    private Nodo ultimo;
 
    
    public void inserta(Persona p) {
        if (cabeza == null) {
            cabeza = new Nodo(p);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        } else if (p.getId() < cabeza.getDato().getId()) {
            Nodo aux = new Nodo(p);
            aux.setNext(cabeza);
            cabeza = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        } else if (ultimo.getDato().getId() <= p.getId()){
            
            Nodo aux = new Nodo(p);
            aux.setNext(cabeza);
            cabeza = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }else if (ultimo.getDato().getId() <= p.getId()){
            ultimo.setNext((new Nodo(p)));
            ultimo = ultimo.getNext();
            ultimo.setNext(cabeza);
            ultimo.setBack(cabeza);
        }else{
            Nodo aux = cabeza;
            while (aux.getNext().getDato().getId() < p.getId()){
                aux = aux.getNext();
            }
            Nodo temp = new Nodo(p);
            temp.setBack(aux.getNext());
            temp.setBack(aux);
            aux.setNext(temp);
            temp.getNext().setBack(temp);
            }
    }
    
    public boolean existe (int id){
        boolean esta = false;
        if(cabeza !=null){
            if(id>=cabeza.getDato().getId() && id <= ultimo.getDato().getId()){
                Nodo aux = cabeza;
                while (aux != ultimo && aux.getDato().getId()<id){
                    aux =   aux.getNext();
                }
                esta = (aux.getDato().getId() == id);
            }
        }
        return esta;
    }
    
    public void modifica(Persona p){
        if(cabeza != null){
            if(p.getId() >= cabeza.getDato().getId() && p.getId() <= ultimo.getDato().getId()){
                Nodo aux = cabeza;
                while (aux != ultimo && aux.getDato().getId()<p.getId()){
                    aux = aux.getNext();
                }
                if(aux.getDato().getId()==p.getId()){
                    aux.getDato().setNombre(p.getNombre());
                }
            }
        }
        
    }
    
    public void elimina(int id){
        if(cabeza != null){
            if(cabeza.getDato().getId() <= id && id <= ultimo.getDato().getId()){
                if(cabeza.getDato().getId() == id){
                    cabeza = cabeza.getNext();
                    ultimo.setNext(cabeza);
                }else{
                Nodo aux = cabeza;
                while (aux.getNext()!= cabeza && aux.getNext().getDato().getId() < id){
                    aux = aux.getNext();
                }
                if(aux.getNext().getDato().getId()==id){
                    if(aux.getNext()==ultimo){
                        ultimo=aux;
                    }
                    aux.setNext(aux.getNext().getNext());
                }
                }
            }
        }
        
    }
    
    public Persona extrae(int id){
        Persona p = null;
        if(cabeza != null){
            if(cabeza.getDato().getId() <= id && id <= ultimo.getDato().getId()){
                if(cabeza.getDato().getId() == id){
                    p=cabeza.getDato();
                    cabeza = cabeza.getNext();
                    ultimo.setNext(cabeza);
                } else {
                    Nodo aux = cabeza;
                   while(aux.getNext() != cabeza && aux.getNext().getDato().getId() < id){
                       aux = aux.getNext();
                   }
                   if(aux.getNext().getDato().getId() == id){
                       p=aux.getNext().getDato();
                       if(aux.getNext()==ultimo){
                           ultimo=aux;
                       }
                       aux.setNext(aux.getNext().getNext());
                   }
                }
            }
        }
        return p;
    }
    

    @Override
    public String toString() {
        Nodo aux = cabeza;
        String s = "Lista: ";
        if(aux !=null){
            s+= aux + ", ";
            aux = aux.getNext();
        while (aux != cabeza) {
            s += aux + ", ";
            aux = aux.getNext();
        }
        }else{
            s+="vacia";
        }
        return s;
    }

}

