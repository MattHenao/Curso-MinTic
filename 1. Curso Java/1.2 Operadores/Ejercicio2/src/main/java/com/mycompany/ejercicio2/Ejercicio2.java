/*
 * Calcular salario semanal de un empleado y salario por hora
 */

package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author matthenao
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horasSemanales;
        float salarioHoras, salarioTotal;
        
        System.out.println("Digite las horas semanales trabajadas: ");
        horasSemanales = entrada.nextInt();
        System.out.println("Digite el salario que gana por hora: ");
        salarioHoras = entrada.nextFloat();
        
        salarioTotal = salarioHoras * horasSemanales;
        
        System.out.println("El salario semanal es: " + salarioTotal);
    }
}
