/*
 * Leer un numero e indicar si es positivo o negativo, el proceso se repetira
 * hasta que se introduzca un 0
 */

package com.mycompany.ejercicio2;

import javax.swing.JOptionPane;


/**
 *
 * @author matthenao
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        
        while(numero != 0){
            if(numero > 0){
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es positivo");
            }
            else if(numero < 0){
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es negativo");
        }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
    }
}
