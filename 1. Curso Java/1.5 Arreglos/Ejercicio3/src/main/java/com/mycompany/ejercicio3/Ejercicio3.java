/*
 * Leer 5 numeros, almacenarlos en un arreglo y realizar la media de 
 * numeros positivos, negativos y contar los numeros 0
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
        float numeros[] = new float[5];
        
        float sumaPositivos = 0, sumaNegativos = 0, mediaPositivos, mediaNegativos; 
        int conteoPositivos = 0, conteoNegativos = 0, conteoCeros = 0;
        
        System.out.println("Guardando los numeros en el arreglo");
        
        for(int i = 0; i < 5; i++){
            System.out.print((i + 1) + ". Digite un numero ");
            numeros[i] = entrada.nextFloat();
            
            if(numeros[i] == 0){
                conteoCeros++;
            }
            else if(numeros[i] > 0){
                sumaPositivos += numeros[i];
                conteoPositivos++;
            }
            else{
                sumaNegativos += numeros[i];
                conteoNegativos++;
            }
        }
        // Media de los numeros positivos
        if(conteoPositivos == 0){
            System.out.println("No se puede sacar la media de los numeros positivos");
        }
        else{
            mediaPositivos = sumaPositivos / conteoPositivos;
            System.out.println("La media de los numeros positivos es: " + mediaPositivos);
        }
        
        // Media de numeros negativos
        if(conteoPositivos == 0){
            System.out.println("No se puede sacar la media de los numeros negativos");
        }
        else{
            mediaNegativos = sumaNegativos / conteoNegativos;
            System.out.println("La media de los numeros negativos es: " + mediaNegativos);
        }
        System.out.println("La cantidad de ceros es: " + conteoCeros);
    }
}