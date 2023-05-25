
public class Invierte {
      public int invertir(int n, int inv) {
        if (n > 0) {
            return invertir(n , n );
        } else {
            return inv;
        }

    }
}
