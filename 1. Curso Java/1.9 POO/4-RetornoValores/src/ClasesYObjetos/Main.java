/*
 * Archivo main para retornar valores
 */
package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author matthenao
 */
public class Main {
    public static void main(String [] args){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        Operacion op = new Operacion();
        
        /* Manera 1 de imrimir resultados
        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int mult = op.multiplicar(n1, n2);
        int div = op.dividir(n1, n2);
        
        op.mostrarResultados(suma, resta, mult, div);
        */
        
        // Manera 2 de imprimir resultado
        System.out.println("La suma es: " + op.sumar(n1, n2));
        System.out.println("La resta es: " + op.restar(n1, n2));
        System.out.println("La multiplicacion es: " + op.multiplicar(n1, n2));
        System.out.println("La division es: " + op.dividir(n1, n2));
    }
}
