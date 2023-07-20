package Examenp2;

public class Main {

    
    public static void main(String[] args) {
        
        String palabraOfrase= "somos";
        
                Main Lista = new Main();
                for (int i = 0; i < palabraOfrase.length();i++){
                    Lista.inserta(new Dato(i+1,Main.charAt(i)));
                    
                }
                if (esPalindroma(Main = Lista)) {
    System.out.println("La palabra o frase: "+Lista.toString()+" es palindroma");
        
    }else{
    System.out.println("La palabra o frase: "+Lista.toString()+" no es palindroma");
            }
    }   
    
}
