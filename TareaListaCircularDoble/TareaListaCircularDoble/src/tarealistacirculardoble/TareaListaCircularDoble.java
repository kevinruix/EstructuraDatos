/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealistacirculardoble;

/**
 *
 * @author jenns
 */
public class TareaListaCircularDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lista laLista = new Lista();
        laLista.inserta(new Persona (6380, "Jennifer"));
        laLista.inserta(new Persona (8841, "Carlos"));
        laLista.inserta(new Persona (123, "Miriam"));
        laLista.inserta(new Persona (7834, "Adrian"));
        System.out.print(laLista);
        laLista.elimina(7834);
        System.out.print("La nueva lista");
        System.out.print(laLista);
        System.out.print("La nueva lista");
        System.out.print(laLista.extrae(481));
   
    }
    
}
