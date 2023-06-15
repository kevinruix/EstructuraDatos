package ejerecursivo;

/**
 *
 * @author Ana Salas
 */
public class Ejemplo1 {

    /* 
    public void Metodo(){
    //instruccion
    Metodo();        
    }
     */

    // Crear una serie numerica del 1 al 5, con un espacio que separe los valores
    //1 2 3 4 5 
    public void incremento(int x) {
        if (x <= 5) {
            System.out.print(x + " ");
            incremento(x + 1);
        }
    }

}
