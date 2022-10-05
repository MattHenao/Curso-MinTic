/*
 * Archivo main del ejercicio 5
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author MattHenao
 */
public class Main {
    public static double mayorArea(Triangulo_Isosceles triangulos[]){
        double area;
        
        area = triangulos[0].obtenerArea();
        for(int i = 1; i < triangulos.length; i++){
            if(triangulos[i].obtenerArea() > area){
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double base, lado;
        int nTriangulos;
        
        System.out.print("Digite la cantidad de triangulos: ");
        nTriangulos = entrada.nextInt();
        Triangulo_Isosceles triangulos[] = new Triangulo_Isosceles[nTriangulos];
        
        for(int i = 0; i < triangulos.length; i++){
            System.out.print("Ingresa la base del triangulo " + (i + 1) + ": ");
            base = entrada.nextDouble();
            System.out.print("Ingresa el area del triangulo " + (i + 1) + ": ");
            lado = entrada.nextDouble();
            
            triangulos[i] = new Triangulo_Isosceles(base, lado);
            System.out.println("\nEl perimetro el triangulo es: " + triangulos[i].obtenerPerimetro());
            System.out.println("El area del triangulo es: " + triangulos[i].obtenerArea());
        }
        
        System.out.println("\nEl area de mayor superficie es: " + (mayorArea(triangulos)));
    }
}
