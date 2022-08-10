/*
 * Un obrero necesita calcular su salario semanal, el cual se obtiene:
 * Si trabaja 40 horas o menos se le paga 16$ por hora
 * Si trabaja mas de 40 horas se le paga 16$ por hora cada una de las primeras 
   40 horas y 20$ por cada hora extra
 */

package com.mycompany.ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author matthenao
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int horasTrabajadas;
        float salarioTotal;
        
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la  cantidad de horas trabajadas: "));
        
        if(horasTrabajadas <= 40){
            salarioTotal = horasTrabajadas * 16;
        }
        else{
            salarioTotal = (40 * 16) + ((horasTrabajadas - 40) * 20);
        }
        
        JOptionPane.showMessageDialog(null, "El salario total es: " + salarioTotal);
    }
}
