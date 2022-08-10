/*
    Ciclo for

    for(Inicializacion ; condicion ; aumento o decremento){
        Insstrucciones;
    }
 */

package com.mycompany.ciclofor;

import java.util.Scanner;

/**
 *
 * @author matthenao
 */
public class App {

    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        int i, contador;
        
        System.out.println("Ingrese la cantidad de numeros: ");
        contador = entrada.nextInt();
        
        for(i = 1; i <= contador; i++){
            System.out.println(i);
        }
    }
}
