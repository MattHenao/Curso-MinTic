package paquete1;

/**
 *
 * @author matthenao
 */
public class Principal {
    public static void main(String [] args){
        Persona persona1 = new Persona("Mateo", 19);
        
        persona1.setEdad(20);
        persona1.mostrarDatos();
    }
}
