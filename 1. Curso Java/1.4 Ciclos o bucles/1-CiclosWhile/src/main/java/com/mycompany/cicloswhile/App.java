/*
    Ciclo while

    while(condicion){
        Instrucciones;
    }
 */

package com.mycompany.cicloswhile;

import java.util.Scanner;

/**
 *
 * @author matthenao
 */
public class App {

    public static void main(String[] args) {
        int i = 1, contador;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite cuantos numeros quieres en pantalla: ");
        contador = entrada.nextInt();
        
        while(i <= contador){
            System.out.println(i);
            i++;
        }
    }
}
