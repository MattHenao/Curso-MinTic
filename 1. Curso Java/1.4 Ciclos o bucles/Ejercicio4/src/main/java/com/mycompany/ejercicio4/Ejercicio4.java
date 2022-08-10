/*
 * Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos
 * numeros se han introducido
 */

package com.mycompany.ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author matthenao
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int numero, count = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        while(numero >= 0){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            count++;
        }
        
        JOptionPane.showMessageDialog(null, "La cantidad de numeros no negtivos introducidos son " + count);
    }
}
