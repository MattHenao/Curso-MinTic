/*
 * Una matriz es una array bidimensional, se necesitan 2 indicces para acceder a sus elementos
 */

package com.mycompany.definicionmatriz;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author matthenao
 */
public class App {

    public static void main(String[] args) {
        //Algoritmo matriz predefinida
        int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // La definicion de matriz tiene dos pares de corchetes
        
        //Imprimir una matriz
        for(int i = 0; i < 3; i++){ // Numerode filas
            for(int j = 0; j < 3; j++){ // Numero columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
        // Algoritmo matriz no definida
        Scanner entrada = new Scanner (System.in);
        int matriz2[][], nFilas, nCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas: "));
        
        // Añadir numero de filas y columnas
        matriz2 = new int[nFilas][nCol];
        
        System.out.println("Digite la matriz: ");
        for(int i = 0; i < nFilas; i++){
            for(int j = 0; j < nCol; j++){
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz2[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nLa matriz es: ");
        for(int i = 0; i < nFilas; i++){ // Numerode filas
            for(int j = 0; j < nCol; j++){ // Numero columnas
                System.out.print(matriz2[i][j]);
            }
            System.out.println("");
        }
    }
}
