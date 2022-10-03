/*
    Construir un programa que permita dirigir el movimiento de un objeto dentro
    de un tablero y actualice su posicion dentro del mismo. Los movimientos
    posibles son ARRIBA, ABAJO, IZQUIERDA, DERECHA. Tras cada movimiento el
    programa mostrara la nueva direccion elegida y las coordenadas de situacion
    objeto dentro del tablero
 */
package Ejercicio2;

/**
 *
 * @author matthenao
 */
public class Tablero {
    private int x;
    private int y;
    
    public Tablero(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void moverArriba(int incremento){
        y += incremento;
    }
    
    public void moverAbajo(int incremento){
        y -= incremento;
    }
    
    public void moverIzquierda(int incremento){
        x -= incremento;
    }
    
    public void moverDerecha(int incremento){
        x += incremento;
    }

    public int getX() {
        return x;
    }
    
    public int getY(){
        return y;
    }
}
