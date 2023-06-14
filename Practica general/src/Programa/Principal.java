/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Programa;

import Pregunta1.Cola;
import Pregunta1.Discapacidad;

/**
 *
 * @author Kevin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola cola =new Cola();
        cola.insertar(1, "Juan", Discapacidad.No);
        cola.insertar(2, "Pedro", Discapacidad.No);
        cola.insertar(3, "Sacha", Discapacidad.Si);
        cola.insertar(4, "Jose", Discapacidad.No);
        cola.insertar(5, "Kimberly", Discapacidad.Si);
        cola.mostrar();
        cola.atender();
        cola.mostrar();
    }
    
}
