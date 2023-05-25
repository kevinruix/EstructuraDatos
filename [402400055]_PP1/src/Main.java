
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Eleva ps = new Eleva();
        ps.factorial(0);
        Scanner sc = new Scanner(System.in);
        //pido el numero
        System.out.print("Digite el numero a calcular el factorial: ");
        int num = sc.nextInt();
        //se le asigna al entero el metodo con el numero a obtener        
        int el = ps.factorial(num);
        System.out.println("El factorial de " + num + " es " + el);

    }
    
}
