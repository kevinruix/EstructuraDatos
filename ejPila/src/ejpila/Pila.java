package ejpila;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Ana Salas
 */
public class Pila {

    private Nodo cima;

    public Pila() {
        this.cima = null;
    }

    public boolean vacia() {
        if (cima == null) {
            return true;
        } else {
            return false;
        }
    }

    public void apilar() {
        //pedimos los datos de animal
        Animal a = new Animal();
        a.setEspecie(JOptionPane.showInputDialog("Ingrese la especie de animal: "));
        a.setPrecio(Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el precio de animal: ")));
        a.setTiempoVida(Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el tiempo de vida del animal: ")));
        //creamos un nodo nuevo y le asignamos los datos de animal
        Nodo nuevo = new Nodo();
        nuevo.setDato(a);
        //validamos si hay algo en la pila
        if (vacia()) {
            cima = nuevo;//si esta vacia, será la nueva cima
        } else {
            nuevo.setSiguiente(cima);//si esta llena, apuntamos al siguiente
            cima = nuevo;//lo insertamos como nueva cima
        }
    }

    public void desapilar() {
        if (!vacia()) {
            cima = cima.getSiguiente();
            JOptionPane.showMessageDialog(null, "El elemento fue desapilado",
                    "Desapilar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error! No se pudo extraer, Pila Vacía",
                    "Pila Vacía", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarElementos() {
        if (!vacia()) {
            String s = "";
            Nodo aux = cima;
            while (aux != null) {
                s += aux.getDato().getEspecie() + "/ \t"
                        + aux.getDato().getPrecio() + "/ \t"
                        + aux.getDato().getTiempoVida() + "\n";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La pila contiene: \n" + s,
                    "Pila Llena", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No existen elementos para mostrar, pila vacía",
                    "Pila Vacía", JOptionPane.ERROR_MESSAGE);
        }
    }
}
