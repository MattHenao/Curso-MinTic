/*
 * Calcular la nota de un estudiante con 4 notas (Participacion, primer
 * parcial, segundo parcial y examen final). Sabiendo que las calificaciones
 * entran a la calificacion final con ponderaciones de 10%, 25%, 25% y 40%.
 */

package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author matthenao
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float participacion, parcial1, parcial2, examenFinal, notaFinal;
        
        System.out.println("Digite la nota de participacion: ");
        participacion = entrada.nextFloat();
        System.out.println("Digite la nota del primer examen parcial: ");
        parcial1 = entrada.nextFloat();
        System.out.println("Digite la nota del segundo examen parical: ");
        parcial2 = entrada.nextFloat();
        System.out.println("Digite la nota del examen final: ");
        examenFinal = entrada.nextFloat();
        
        participacion *= 0.10f;
        parcial1 *= 0.25f;
        parcial2 *= 0.25f;
        examenFinal *= 0.40f;
        
        notaFinal = participacion + parcial1 + parcial2 + examenFinal;
        
        System.out.println("\nLa nota final es: " + notaFinal);
    }
}
