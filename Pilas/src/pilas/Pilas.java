
package pilas;

import javax.swing.JOptionPane;


public class Pilas {


    public static void main(String[] args) {
        Pila p=new Pila();
        p.apilar();
     p.apilar();
     p.apilar();
     p.mostrar();
     p.desapilar();
     p.mostrar();
     p.desapilar();
      p.mostrar();
     p.apilar();
     p.mostrar();     
    }
    public class Dato{
        private String nombre;
        public Dato(){
            this.nombre="";
        }
        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
    }
public class NodoP{
    private Dato elemento;
    private NodoP siguiente;
    public NodoP(){
        this.siguiente = null;
    }
    public Dato getElemento(){
        return elemento;
    }
    public void setElemento(Dato elemento){
        this.elemento=elemento;
    }
    public NodoP getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(NodoP siguiente){
        this.siguiente = siguiente;
    }
    
    public class Pila {
        private NodoP cima;
        public Pila(){
            this.cima=null;
        }
    }
    public boolean esVacia(){
        if(cima==null){
            return true;
        }else{
            return false;
        }
    }
    public void apilar(){
        Dato d=new Dato(){
            d.setNombre(JOptionPane.showInputDialog(null,"Digite el nombre:"));
            NodoP nuevo=new NodoP();
            nuevo.setElemento(d);
            if(esVacia()){
                cima=nuevo;
            }else{
            nuevo.setSiguiente(cima);
            cima=nuevo;
        }
        }
                public void desapilar(){
                    if(!esVacia()){
                        cima=cima.getSiguiente();
                        JOptionPane.showMessageDialog(null,"El elemento fue extraido!");
                        
                    }else{
                        JOptionPane.showMessageDialog(null,"No se puede extraer, pila vacia!");
                        
                    }
                    public String toString(){
                        String s ="";
                        if(!esVacia()){
                            NodoP aux = cima;
                            while (aux != null){
                                s = s+ aux + "\n";
                                aux = aux.getSiguiente();
                            }
                        }return s;
                    }
                }
    }
}
}
