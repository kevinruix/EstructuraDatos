package ejpila;

/**
 *
 * @author Ana Salas
 */
public class Nodo {

    private Animal dato;
    private Nodo siguiente;

    public Nodo() {
        this.siguiente = null;
    }

    /**
     * @return the dato
     */
    public Animal getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Animal dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
