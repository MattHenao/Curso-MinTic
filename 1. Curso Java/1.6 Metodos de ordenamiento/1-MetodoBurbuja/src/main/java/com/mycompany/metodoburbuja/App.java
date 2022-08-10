/*
 * Metodo burbuja
 */

package com.mycompany.metodoburbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author matthenao
 */
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad e elementos"));
        
        arreglo = new int[nElementos]; //Le asignamos el numero de elementosal arreglo
        
        for(int i = 0; i < nElementos; i++){
            System.out.print((i + 1) + " ." + "Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        //Metodo burbuja
        for(int i = 0; i < (nElementos - 1); i++){
            for(int j = 0; j < nElementos - 1; j++){
                if(arreglo[j] > arreglo[j + 1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }   
        }
        System.out.println("\nArreglo ordenado forma creciente");
        for (int i = 0; i < nElementos; i++){
            System.out.print(arreglo[i] + " - ");
        }
        
        System.out.println("\nArreglo ordenado forma decreciente");
        for(int i = (nElementos - 1); i >= 0; i--){
            System.out.print(arreglo[i] + " - ");
        }
    }
}