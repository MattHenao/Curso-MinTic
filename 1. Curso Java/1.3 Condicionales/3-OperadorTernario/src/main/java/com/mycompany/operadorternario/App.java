/* El operador ternario '?'
    valor = (Condicion) ? valor1 : valor2;
 */

package com.mycompany.operadorternario;

import javax.swing.JOptionPane;

/**
 *
 * @author matthenao
 */
public class App {

    public static void main(String[] args) {
        int numero;
        String mensaje;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        mensaje = (numero % 2 == 0) ? "Es par" : "Es impar";
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
