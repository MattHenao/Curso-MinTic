/*
 * Bucle for each
 */

package com.mycompany.foreach;

/**
 *
 * @author matthenao
 */
public class App {

    public static void main(String[] args) {
        String[] nombres = {"Alejandro", "Maria", "Luisa", "Juan", "Narcisa", "Luis"};
        
        for(String i:nombres){
            System.out.println("Nombres: " + i);
        }
    }
}
