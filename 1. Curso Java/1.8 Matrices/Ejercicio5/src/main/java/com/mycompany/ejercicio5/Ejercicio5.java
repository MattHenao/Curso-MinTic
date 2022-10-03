/*
 * Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y columna
 */

package com.mycompany.ejercicio5;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author matthenao
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas, nCol, sumaFilas, sumaCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de filas de la matriz: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de columnas de la matriz: "));
        
        matriz = new int[nFilas][nCol];
        
        System.out.println("Ingresa los datos de la matriz: ");
        for(int i = 0; i < nFilas; i++){
            for(int j = 0; j < nCol; j++){
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
            System.out.println("");
        }
        
        System.out.println("\nLa matriz es: ");
        for(int i = 0; i < nFilas; i++){
            for(int j = 0; j < nCol; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        // Ahora procedemos a sumar las filas
        for(int i = 0; i < nFilas; i++){
            sumaFilas = 0;
            for(int j = 0; j < nCol; j++){
                sumaFilas += matriz[i][j];
            }
            System.out.print("\nLa suma de la fila [" + i + "] es: " + sumaFilas);
        }
        System.out.println("");
        
        //Por ultimo sumamos las columnas
        for(int j = 0; j < nCol; j++){
            sumaCol = 0;
            for(int i = 0; i < nFilas; i++){
                sumaCol += matriz[i][j];
            }
            System.out.print("\nLa suma  de la columna [" + j + "] es: " + sumaCol);
        }
        System.out.println("");
    }
}
