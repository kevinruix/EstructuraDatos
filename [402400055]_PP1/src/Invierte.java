
public class Invierte {
     public class Funciones {
    public static String invierte(int num){
        String numS = Integer.toString(num);
        int cont = numS.length();
        String cadena = "";
        while(cont >= 0){
            cadena += numS.charAt(cont);
            cont --;
        }
        return cadena;
    }
    public static void main(String[] args) {
        System.out.println(invierte(1234));
    }
     }}