package ejpila;

import javax.swing.JOptionPane;

/**
 *
 * @author Ana Salas
 */
public class Menu {

    private int op;
    private Pila p = new Pila();

    public void mostrar() {
        op = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Menu Princial\n"
                + "1. Agregar elemento\n"
                + "2. Extraer elemento\n"
                + "3. Mostrar elemento\n"
                + "4. Salir\n"
                + "Digite la opción deseada: ", "Menu Principal",
                JOptionPane.QUESTION_MESSAGE));

        //tiramos las opciones
        switch (op) {
            case 1:
                p.apilar();
                mostrar();
                break;
            case 2:
                p.desapilar();
                mostrar();
                break;
            case 3:
                p.mostrarElementos();
                mostrar();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error, opción invalida. "
                        + "\nVuelva a intetarlo");
                mostrar();
        }

    }
}
