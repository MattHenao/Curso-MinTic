/*
 * Programa que lea un caracter por teclado y compruebe si es letra mayuscula
 */

package com.mycompany.ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author matthenao
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        char letra;
        
        letra = JOptionPane.showInputDialog("Ingresa una letra: ").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        }
        else{
            JOptionPane.showMessageDialog(null, "Es una letra minuscula");
        }
    }
}
