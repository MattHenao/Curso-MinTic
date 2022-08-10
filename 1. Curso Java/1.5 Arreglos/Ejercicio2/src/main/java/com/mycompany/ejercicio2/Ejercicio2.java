/*
 * Leer 5 numeros, guarfarlos en un arreglo y mostrarlos en el orden
 * inverso al introducido
 */

package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author matthenao
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero[] = new float[5];
        
        System.out.println("Guardando los datos del arreglo");
        for(int i = 0; i < 5; i++){
            System.out.print((i + 1) + ". Digite un numero: ");
            numero[i] = entrada.nextFloat();
        }
        System.out.println("\nLos elementos del arreglo en orden inverso son: ");
        
        for(int i = 4; i >= 0; i--){
            System.out.println(numero[i]);
        }
    }
}
