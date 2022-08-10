/*
 * Guillermo tiene X dolares. Luis tiene la mitad de lo que
 * posee Guillermo. Juan tiene la mitad de lo que poseen Luis
 * y Guillermo juntos.
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author matthenao
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float dineroGuille, dineroLuis, dineroJuan, total;
        
        System.out.println("Ingresa la cantidad de dinero de Guille: ");
        dineroGuille = entrada.nextFloat();
        
        dineroLuis = dineroGuille / 2;
        System.out.println("Luis tiene esta cantidad de dinero: " + dineroLuis);
        
        dineroJuan = (dineroGuille + dineroLuis) / 2;
        System.out.println("Juan tiene esta cantidad de dinero: " + dineroJuan);
        
        total = dineroGuille + dineroLuis + dineroJuan;
        System.out.println("El total de todos es: " + total);
    }
}
