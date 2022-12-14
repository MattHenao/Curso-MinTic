/*
 * Crear y cargar una matriz de tamaño n x m y decir si es simética o no.
 * Matriz simétrica: Cuando es una matriz cuadrada (nFilas == nCol)
 * Cuando se obtiene la misma matriz al cambiar sus filas por sus columnas
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author matthenao
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nCol;
        boolean simetrica = true;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de columnas: "));
        
        matriz = new int [nFilas][nCol];
        
        System.out.println("Digite una matriz");
        
        for(int i = 0; i < nFilas; i++){
            for(int j = 0; j < nCol;j++){
                System.out.print("Matriz [" + i +"][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        if(nFilas == nCol){
            int i, j;
            i = 0;
            
            while(i < nFilas && simetrica == true){
                j = 0;
                while(j < i && simetrica == true){
                    if(matriz[i][j] != matriz[j][i]){
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if(simetrica == true){
                JOptionPane.showMessageDialog(null, "La matriz es simétrica");
            }
            else{
                JOptionPane.showMessageDialog(null, "La matriz no es simétrica");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"La matriz no es simétrica");
        }
    }
}
