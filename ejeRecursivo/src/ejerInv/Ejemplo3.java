package ejerInv;

/**
 *
 * @author Ana Salas
 */
public class Ejemplo3 {

    public Ejemplo3() {

    }

    public int invertir(int n, int inv) {
        if (n > 0) {
            return invertir(n / 10, n % 10 + inv * 10);
        } else {
            return inv;
        }

    }

}
