
package ejerecursivo;

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
        Ejemplo1 e= new Ejemplo1();
        Scanner sc= new Scanner(System.in);
        int num=0;
        System.out.println("Ingrese el valos inicial");
        num=sc.nextInt();
        ///imprime la serie
        System.out.println("\nSerie");
        e.incremento(num);
        
    }
    
}
