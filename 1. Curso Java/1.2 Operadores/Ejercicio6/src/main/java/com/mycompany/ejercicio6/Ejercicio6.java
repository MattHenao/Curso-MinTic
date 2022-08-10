/*
 * Hacer un programa que calcule el cuadrado de una suma
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
        double suma1, suma2, total;
        
        System.out.println("Digite los numeros por sumar: ");
        suma1 = entrada.nextDouble();
        suma2 = entrada.nextDouble();
        
        total = Math.pow(suma1, 2) + Math.pow(suma2, 2) + (2 * suma1 * suma2);
        
        System.out.println("El resultado es: " + total);
    }
}
