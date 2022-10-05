/*
    Construir un programa para trabajar con 2 numeros complejos, implemente el
    Siguiente menu:
    1. Sumar 2 numeros complejos
    2. Multiplicar 2 numeros complejos
    3. Comparar 2 numeros complejos (Iguales o no)
    4. Multiplicar un numero complejo por un entero
*/
package Ejercicio6;

/**
 *
 * @author MattHenao
 */
public class NumeroComplejo {
    // Ejemplo: 3 + 4i
    private double a; //Parte real
    private double b; // Parte imaginaria
    
    public NumeroComplejo(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA(){
        return a;
    }
    
    public double getB(){
        return b;
    }
    
    /*
        numero1 = 3 + 4i
        numero2 = 2 + 5i
    
        suma = 5 + 9i
    */
    
    public NumeroComplejo calcularSuma(NumeroComplejo c){
        NumeroComplejo suma = new NumeroComplejo(a + c.getA(), b + c.getB());
        return suma;
    }
    
    /*
        numero1 = 3 + 4i
        numero2 = 2 + 5i
    
        mult = (3*2 - 4*5) + (3*5 + 4*2)i
    */
    public NumeroComplejo calcularProducto(NumeroComplejo c){
        NumeroComplejo mult = new NumeroComplejo((a*c.getA()) - (b*c.getB()), (a*c.getB() + b*c.getA()));
        return mult;
    }
    
    /*
        numero1 = 3 + 4i
        numero2 = 2 + 5i
    */
    public boolean comprobarIgualdad(NumeroComplejo c){
        boolean igualdad = false;
        
        if((a == c.getA()) && (b == c.getB())){
            igualdad = true;
        }
        
        return igualdad;
    }
    
    /*
        NumeroComplejo = 3 + 4i;
        entero = 2;

        mult = 6 + 8i;
    */
    
    public NumeroComplejo multiplicarPorEntero(int x){
        NumeroComplejo mult = new NumeroComplejo(a * x, b * x);
        return mult;
    }
}
