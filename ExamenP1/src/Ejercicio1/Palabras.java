package Ejercicio1;

public class Palabras {
    public Palabras palabra;
        String pal;
        String palInver = invierte(pal);
        

    
    public String invierte(String x) {
       
        if (pal.length() > 1) {
            char charUltimo = pal.charAt(pal.length()-1); 
            String nuevaXString = pal.substring(0, pal.length()-1);
            int nuevaX = Integer.parseInt(nuevaXString);
            return Integer.parseInt(charUltimo + Integer.toString(invierte(nuevaX)));
            
        }
        return Integer.toString(pal.charAt(0));
        
    }

    public Palabras getPalabra() {
        return palabra;
    }

    public String getPal() {
        return pal;
    }

    public String getPalInver() {
        return palInver;
    }
    
}
