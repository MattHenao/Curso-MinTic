/*
 * Entrada y salida de datos por consola
 * Double funciona igual que float, solo usar nextDouble()
 * Para guardar un string se usa nextLine()
 * Para guardar una palabra de una frase se usa next()
 * Para guardar un caracter se usa next().charAt(0)
 */

package com.mycompany.entadasalidadatosconsola;

import java.util.Scanner; // Importar esta libreria para usar Scanner

/**
 *
 * @author matthenao
 */
public class App {

    public static void main(String[] args) {
        Scanner entradaInt = new Scanner(System.in); // Usar Sacnner para digitar los datos
        int numero;
        
        System.out.println("Digite un numero: ");
        numero = entradaInt.nextInt(); // Guardar el numero digitado
        System.out.println("El numero es " + numero);
        
        Scanner entradaFloat = new Scanner(System.in);
        float numeroFloat;
        
        System.out.println("Digite un numero decimal: ");
        numeroFloat = entradaFloat.nextFloat(); // Para guardar el float usar "," en vez de "."
        System.out.println("El numero es " + numeroFloat);
        
        
    }
}
