/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec04;
public class Lec04{
    public static void main (String args[]) {
        Cola laCola=new Cola();
        laCola.encola(new NodoC("Juan"));
        laCola.encola(new NodoC("Pedro"));
        laCola.encola(new NodoC("Sebastian"));
        laCola.encola(new NodoC("Daniela"));
        laCola.encola(new NodoC("Andres"));
        System.out.println("La cola original");
        System.out.print(laCola);
        System.out.println("Atiendo 2");
        NodoC nodo=laCola.atiende();
        System.out.println(nodo);
        System.out.println(laCola.atiende());
        System.out.println("Encolo uno más");
        laCola.encola(new NodoC("Andrea"));
        System.out.print(laCola);
    }
}