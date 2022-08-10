/*
 *
 *
 */

package com.mycompany.datosprimitivos;

/**
 *
 * @author matthenao
 */
public class App {

    public static void main(String[] args) {
        byte enteroBit = 12;
        System.out.println("Numero entero byte :" + enteroBit);

        short enteroShort = 1234;
        System.out.println("Numero entero short :" + enteroShort);
        
        int enteroInt = 17283;
        System.out.println("Numero entero int :" + enteroInt);
        
        long enteroLong = 5467897;
        System.out.println("Numero entero long :" + enteroLong);
        
        float decimalFloat = 3.16f; //Poner "f" despues de el numero
        System.out.println("Numero decimal float: " + decimalFloat);
        
        double decimalDouble = 36.987; //No poner "f" despues de numero
        System.out.println("Numero decimal double: " + decimalDouble);
        
        char caracter = '5';
        System.out.println("Caracter: " + caracter);
        
        boolean decision = false;
        System.out.println("La decision es " + decision);
    }
}
