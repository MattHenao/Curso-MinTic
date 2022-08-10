/*
 * Entrada y salida de datos con JoptionPane
 */

package com.mycompany.joptionpane;

import javax.swing.JOptionPane; // LIbreria para usar JoptionPane
/**
 *
 * @author matthenao
 */
public class App {

    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena: "); // Aparece una pestaña para ingresar datos
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero: ")); // Convertir cadena en entero
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0); // Solo un caracter
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: ")); // Convertir cadena a double
        
        JOptionPane.showMessageDialog(null, "La cadena es : " + cadena); // Aparece una pestaña con los datos
        JOptionPane.showMessageDialog(null, "El numero es: " + entero);
        JOptionPane.showMessageDialog(null, "La letra es : " + letra);
        JOptionPane.showMessageDialog(null, "El numero decimal es: " + decimal); // Este metodo tengo que poner "." en vez de ","
    }
}
