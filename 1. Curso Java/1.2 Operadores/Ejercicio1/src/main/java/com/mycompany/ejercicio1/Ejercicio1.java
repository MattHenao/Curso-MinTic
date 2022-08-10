/*
 * Calcular la suma de 3 notas
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author matthenao
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Ingresa 3 notas");
        Scanner nota = new Scanner(System.in);
        float nota1;
        
        System.out.println("Primera nota: ");
        nota1 = nota.nextFloat();
        
        float nota2;
        
        
        System.out.println("Segunda nota: ");
        nota2 = nota.nextFloat();
        
        float nota3;
        
        System.out.println("Tercera nota: ");
        
        nota3 = nota.nextFloat();
        
        float resultado = nota1 + nota2 + nota3;
        System.out.println("̣El resultado es " + resultado);
    }
}
