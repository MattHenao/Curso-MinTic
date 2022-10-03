/*
 * Crear una matriz "marco" de tamaño 5x5: todos sus elementos deben ser 0
 * salvo los de los bordes que deben ser 1. Mostrarla
 */

package com.mycompany.ejercicio7;

/**
 *
 * @author matthenao
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        
        //Rellenando la matriz
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(i == 0 || i == 4){ //Delimita las columnas
                    matriz[i][j] = 1;
                }
                else if(j == 0 || j == 4){
                    matriz[i][j] = 1;
                }
                else{ //No es necesario porque Java automaticamente pone el valor de la matriz en 0
                    matriz[i][j] = 0;
                }
            }
        }
        System.out.println("La matriz es: \n");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
