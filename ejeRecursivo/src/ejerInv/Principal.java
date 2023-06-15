package ejerInv;

import javax.swing.JOptionPane;

/**
 *
 * @author Ana Salas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo3 e = new Ejemplo3();
        int inv = 0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a invertir"));
        JOptionPane.showMessageDialog(null, e.invertir(num, inv),
                "Inversa",JOptionPane.QUESTION_MESSAGE);

    }

}
