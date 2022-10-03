/*
 * Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y trasponerla en la segunda
 */

package com.mycompany.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author matthenao
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz1[][], matriz2[][];
        matriz1 = new int[5][9];
        matriz2 = new int[9][5];
        
        System.out.println("Ingresa los datos de la primera matriz: ");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 9; j++){
                System.out.print("Matriz 1[" + i + "][" + j + "]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("\nLa matriz es: ");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println("");
        }
        
        //Trasponemos
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 9; j++){
                matriz2[j][i] = matriz1[i][j];
            }
        }
        
        System.out.println("\nLa matriz traspuesta es: ");
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("");
        }        
    }
}
