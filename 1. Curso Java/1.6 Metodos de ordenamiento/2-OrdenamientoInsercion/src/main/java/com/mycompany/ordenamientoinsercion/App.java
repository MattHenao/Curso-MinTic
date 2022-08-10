/*
 * Ordenamiento por inserción
 */

package com.mycompany.ordenamientoinsercion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author matthenao
 */
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, pos, aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));
        
        arreglo = new int[nElementos];
        
        System.out.println("Rellene el arreglo: ");
        for(int i = 0; i < nElementos; i++){
            System.out.print((i + 1) + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        // Ordenamiento por inserción
        for(int i = 0; i < nElementos; i++){
            pos = i;
            aux = arreglo[i];
            
            while((pos > 0) && (arreglo[pos - 1] > aux)){
                arreglo[pos] = arreglo[pos - 1];
                pos--;
            }
            arreglo[pos] = aux;
        }
        System.out.println("\nOrden ascendente: ");
        for(int i = 0; i < nElementos; i++){
            System.out.print(arreglo[i] + " - ");
        }
    }
}
