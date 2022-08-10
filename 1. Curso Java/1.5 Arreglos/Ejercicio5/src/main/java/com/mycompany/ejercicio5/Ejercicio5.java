/*
 * Leer por teclado 2 tablas de 10 numeros enteros y mesclarlas en una tercera
 * de la forma: el 1 de A, el 1 de B, el 2 de A, el 2 de B, etc
 */

package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author matthenao
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];
        
        a = new int[10];
        b = new int[10];
        c = new int[20];
        
        System.out.println("Digite el primer arreglo");
        for(int i = 0; i < 10; i++){
            System.out.print((i + 1) + ". Digite un numero: ");
            a[i] = entrada.nextInt();
        }
        
        System.out.println("\nDigite el segundo arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            b[i] = entrada.nextInt();
        }
        
        // Iterador i para a y b, y el iterador j para c
        int j = 0;
        for(int i = 0; i < 10; i++){
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        
        System.out.print("\nEl tercer arreglo es: ");
        for(int i = 0; i < 20; i++){
             System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}
