/*
    Constantes
    Es un espacio de memoria que guarda un valor, y ese valor no va a cambiar a lo
    largo del programa
 */
package paquete1;

/**
 *
 * @author matthenao
 */
public class Persona {
    private final String nombre;
    private int edad;
    
    //Constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad ess: " + edad);
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
}
