/*
 * 
 */

package com.mycompany.ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author matthenao
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int numero, contador = 0;
        double aleatorio;
        
        aleatorio = (int)(Math.random() * 100); //Numero aleatorio enteros
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero por adivinar: "));
        
        while(numero != aleatorio){
            contador++;
            if(numero > aleatorio){
                JOptionPane.showMessageDialog(null, "Es menor");
            }
            else if(numero < aleatorio){
                JOptionPane.showMessageDialog(null, "Es mayor");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero por adivinar: "));
        }
        JOptionPane.showMessageDialog(null, "El numero de intentos fue " + contador);
    }
}
