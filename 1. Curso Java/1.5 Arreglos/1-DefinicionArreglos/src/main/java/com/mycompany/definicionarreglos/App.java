/*
 * Introduccion de arrays 
 * Definicion de arrays manuamente
 */

package com.mycompany.definicionarreglos;

/**
 *
 * @author matthenao
 */
public class App {

    public static void main(String[] args){
        int[] numero = new int[3]; //Definir un array vacio
        
        numero[0] = 7; //Definir los valores de cada posicion del array
        numero[1] = 10;
        numero[2] = 13;
        
        /*
        int[] numero = {7, 10, 13} es equivalente al de arriba
        */
        for(int i = 0; i < 3; i++){
            System.out.println(numero[i]);
        }
    }
}
