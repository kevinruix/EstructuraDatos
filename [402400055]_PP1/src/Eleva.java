public class Eleva {
     public int factorial(int n) {
        int resultado = 0;
        if (n > 0) {
            resultado = n * factorial(n - 1);
            return resultado;
        }
        return 1;
     }
}
