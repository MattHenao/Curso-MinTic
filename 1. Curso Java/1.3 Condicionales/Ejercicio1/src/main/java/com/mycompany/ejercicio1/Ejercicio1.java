/*
 * Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10
 */

package com.mycompany.ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author matthenao
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int numero;
        String mensaje;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : "));
        
        mensaje = (numero % 10 == 0) ? "Es multiplo de 10" : "No es multiplo de 10";
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
