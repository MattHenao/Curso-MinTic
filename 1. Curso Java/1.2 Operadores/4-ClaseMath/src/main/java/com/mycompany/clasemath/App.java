/*
 * Clase math
 */

package com.mycompany.clasemath;

/**
 *
 * @author matthenao
 */
public class App {

    public static void main(String[] args) {
        int raiz = (int)Math.sqrt(9); //sqrt solo funciona con double
        //Asi se puede convertir un int a double (Solo con raices exacta)
        
        System.out.println(raiz);
        
        double base = 5, exponente = 2;
        double resultado = Math.pow(base, exponente); //Para sacar exponente
        
        System.out.println(resultado);
        
        double numero = 4.56; // Si se usa tipo float, se debe usar int en vez de long
        long resultadoRound = Math.round(numero); //Para redondear el numero
        
        System.out.println(resultadoRound);
        
        double numeroRandom = Math.random(); //  Para sacar un numero random
        
        System.out.println(numeroRandom);
    }
}
