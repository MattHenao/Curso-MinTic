/*
 * Llenar un array
 */

package com.mycompany.llenararreglo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author matthenao
 */
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos del array: "));
        
        char[] letras = new char[nElementos]; //Crear arreglos conla cantidad que diga el usuario
        
        System.out.println("Digite elementos del arreglo: ");
        
        for(int i = 0; i < nElementos; i++){ //Elementos del arreglo que diga el ususario
            System.out.println((i + 1) + " Digite un caracter: ");
            letras[i] = entrada.next().charAt(0);
        }
        
        System.out.println("\nLos caracteres del arreglo son: ");
        for(int i = 0; i < nElementos; i++){ //Imprimir los elementos del usuario
            System.out.print(letras[i] + " ");
        }
    }
}
