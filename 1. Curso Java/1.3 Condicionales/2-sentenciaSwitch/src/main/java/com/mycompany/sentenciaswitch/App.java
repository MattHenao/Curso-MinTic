/* La sentencia switch:

    switch(dato){
        case 1: Intrucciones1;
                break;
        case 2: Intrucciones2;
                break;
        ...
        case n: Intrucciones;
                break;
        default: CasoContrario;
                break;
    }
 */

package com.mycompany.sentenciaswitch;

import javax.swing.JOptionPane;

/**
 *
 * @author matthenao
 */
public class App {

    public static void main(String[] args) {
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        switch(dato){
            case 1: JOptionPane.showMessageDialog(null, "Es el numero 1");
                    break;
            case 2: JOptionPane.showMessageDialog(null, dato);
                    break;
            case 3: JOptionPane.showMessageDialog(null, "Es el numero 3");
                    break;
            case 4: JOptionPane.showMessageDialog(null, "Es el numero 4");
                    break;
            case 5: JOptionPane.showMessageDialog(null, "Es el numero 5");
                    break;
            default: JOptionPane.showMessageDialog(null, "El numero no esta en el rango de 1 a 5");
                    break;
        }
    }
}
