
package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author matthenao
 */
public class Operacion {
    //Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Metodos
    
    //Metodo para sumar ambos numeros
    public void sumar(int numero1, int numero2){
        suma = numero1 + numero2;
    }
    
    //Metodo para restar ambos numeros
    public void restar(int numero1, int numero2){
        resta = numero1 - numero2;
    }
    
    //Metodo para multiplicar ambos numeros
    public void multiplicar(int numero1, int numero2){
        multiplicacion = numero1 * numero2;
    }
    
    //Metodo para dividir ambos numeros
    public void dividir(int numero1, int numero2){
        division = numero1 / numero2;
    }
    
    //Mostrar resultados
    public void mostrarResultados(){
        System.out.println("La suma es " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
}
