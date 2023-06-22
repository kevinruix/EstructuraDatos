
package ListasSimples;


public class Nodo {
    private Persona dato;
    private Nodo next;
    
    public String toString(){
        return "Nodo{"+"dato="+dato+"}";
    }

    public Nodo(Persona dato) {
        this.dato = dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Persona getDato() {
        return dato;
    }

    public Nodo getNext() {
        return next;
    }
         
    
    
}
