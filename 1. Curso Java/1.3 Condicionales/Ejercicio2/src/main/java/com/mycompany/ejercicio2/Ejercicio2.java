/*
 * Pedir 2 numeros y decir cual es mayor o si son iguales
 */

package com.mycompany.ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author matthenao
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        float numero1, numero2;
        
        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        
        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null, "El numero " + numero1 + " es mayor que " + numero2);
        }
        else if(numero2 > numero1){
            JOptionPane.showMessageDialog(null, "El numero " + numero2 + " es mayor que " + numero1);
        }
        else{
            JOptionPane.showMessageDialog(null, "Los 2 numeros son iguales");
        }
    }
}
