package ejerFact;

import java.util.Scanner;

/**
 *
 * @author Ana Salas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo2 e = new Ejemplo2();
        Scanner sc = new Scanner(System.in);
        //pido el numero
        System.out.print("Digite el numero a calcular el factorial: ");
        int num = sc.nextInt();
        //se le asigna al entero el metodo con el numero a obtener        
        int fa = e.factorial(num);
        System.out.println("El factorial de " + num + " es " + fa);

    }

}
