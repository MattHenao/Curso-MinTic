/*
 * Main sobrecarga de metodos
 */
package ClasesYObjetos;

/**
 *
 * @author matthenao
 */
public class Main {
    public static void main(String [] args){
        Persona persona1 = new Persona("Mateo", 19);
        persona1.correr();
        
        Persona persona2 = new Persona("12128182");
        persona2.correr(7);
    }
}
