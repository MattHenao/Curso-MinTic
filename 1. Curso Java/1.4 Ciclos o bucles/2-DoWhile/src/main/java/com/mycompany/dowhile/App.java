/*
    Ciclo do while
    do{
        Intrucciones;
    }while(condicion);

 * Se ejecuta por lo menos una vez
 */

package com.mycompany.dowhile;

import java.util.Scanner;

/**
 *
 * @author matthenao
 */
public class App {

    public static void main(String[] args) {
        int i = 1, contador;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite la cantidad de numeros: ");
        contador = entrada.nextInt();
        
        do{
            System.out.println(i);
            i++;
        }while(i <= contador);
    }
}
