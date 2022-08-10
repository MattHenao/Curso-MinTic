/*
 * Una compañia de venta de venta de carros usados, paga a su personal
 * de ventas un salario de $1000 mensuales, mas una comision de $150
 * por cada carro vendido, mas el 5% del valor de la venta por carro.
 * cada mes el capturista de la empresa ingresa en la computadora los
 * datos pertinentes. Hacer un programa que calcule e imprima el salario
 * mensual de un vendedor dado.
 */

package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author matthenao
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        final  int salarioMensual = 1000;
        final int comisionValor = 150;
        
        System.out.println("Ingresa la cantidad de vehiculos vendidos este mes: ");
        Scanner entrada = new Scanner(System.in);
        int carrosVendidos;
        carrosVendidos = entrada.nextInt();
        
        System.out.println("Ingresa el valor de los carros: ");
        float precioCarro;
        precioCarro = entrada.nextInt();
        
        float comision, cincoPorciento, totalPorciento;
        comision = comisionValor * carrosVendidos;
        cincoPorciento = (precioCarro * 5) / 100;
        totalPorciento = cincoPorciento * carrosVendidos;
        
        float total = salarioMensual + comision + totalPorciento;
        System.out.println("El salario de este mes es: " + total);
    }
}
