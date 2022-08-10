/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
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
        
        int a[], b[], c[];
        int i, j;
        
        a = new int[12]; // Arreglo a[] y b[] va a tener 2 elementos
        b = new int[12];
        c = new int[24]; // Arreglo c va almacenar a a[] y a b[]
        
        // Pedimos el arreglo a[]
        System.out.println("Digite el arreglo a: ");
        
        for(i = 0; i < 12; i++){
            System.out.print((i + 1) + ". Digite un numero: ");
            a[i] = entrada.nextInt();
        }
        
        // Pedimos el arreglo b[]
        System.out.println("Digite el arreglo b: ");
        
        for(i = 0; i < 12; i++){
            System.out.print((i + 1) + ". Digite un numero: ");
            b[i] = entrada.nextInt();
        }
        
        // Mesclar arreglo a[] y b[]
        // El iterador i sera para los arreglos a[] y b[]
        // El iterador j sera para el arreglo c[]
        
        i = 0;
        j = 0;
        
        while(i < 12){
            // Copiar los 3 elementos de a[]
            for(int k = 0; k < 3; k++){
                c[j] = a[i + k];
                j++;
            }
            
            //  Copar los 3 elementos de b[]
            for(int k = 0; k < 3; k++){
                c[j] = b[i + k];
                j++;
            }
            i += 3;
        }
        System.out.println("El arreglo resultante es: ");
        
        for(i = 0; i < 24; i++){
            System.out.print(c[i] +" - ");
        }
        System.out.println();
    }
}
