/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pila;

/**
 *
 * @author Kevin
 */
public class Principal {

    /**
     * En este ejercicio debe implementar una pila que almacene monedas de 50,100,500 colones,
     * ademas el programa debe contener metodos que permitan ingresar y extraer monedas a la pila
     * asi como indicar el monto en colones que suman las monedas, para eso cree clases con los 
     * siguientes atributos requeridos: moneda, nodo, pila.
     */
    public static void main(String[] args) {
      Pila01 pila = new Pila01();
      pila.ingresar(TipoMoneda.Quinientos);pila.ingresar(TipoMoneda.Cien);pila.ingresar(TipoMoneda.Cien);pila.ingresar(TipoMoneda.Cincuenta);
        System.out.println("Las monedas en la pila son de: "+pila.toString()+" colones");
    }
    
}
