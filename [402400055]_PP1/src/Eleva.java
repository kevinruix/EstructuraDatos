import java.math.BigInteger;
import java.util.Scanner;

public class Eleva {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce el numero base");
    BigInteger base = scanner.nextBigInteger();
    System.out.println("Introduce el exponente");
    BigInteger exponente = scanner.nextBigInteger();
    System.out.println(potencia(base, exponente));
  }

  static BigInteger potencia(BigInteger base, BigInteger exponente) {
    BigInteger resultado = BigInteger.ONE;
    for (BigInteger i = BigInteger.ZERO; i.compareTo(exponente) != 0; i = i.add(BigInteger.ONE)) {
      resultado = resultado.multiply(base);
    }
    return resultado;
  }
}