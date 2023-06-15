/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import Ejercicio1.Palabras;


public class main {

    
    public static void main(String[] args) {
     Palabras palabras = new Palabras();
     palabras.invierte("hola");
     System.out.println("La palabra es "+palabras.getPal()+"y invertida seria: "+palabras.getPalInver());
    }
    
}
