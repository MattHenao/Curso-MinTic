/*
 * Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se
 * introduzca un numero negativo
 */

package com.mycompany.ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author matthenao
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int numero, cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while(numero >= 0){
            cuadrado = (int)Math.pow(numero, 2);
            
            JOptionPane.showMessageDialog(null, "El numero " + numero + " Elevado al cuadrado es " + cuadrado);
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
    }
}
