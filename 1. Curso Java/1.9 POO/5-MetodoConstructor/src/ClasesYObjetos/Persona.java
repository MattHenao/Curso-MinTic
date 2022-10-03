/*
    Es un metodo especial de una clase que se invoca siempre que se crea un objeto de esa clase.
    - Se asigna memoria para el objeto
    - Se inicializan los atributos de ese objeto
    - Se invoca al constructor de la clase que puede ser uno entre varios
 */
package ClasesYObjetos;

/**
 *
 * @author matthenao
 */
public class Persona {
    // Atributos
    String nombre;
    int edad;
    
    //Metodo

    //Metodo constructor son los unicos que no se le pone el tipo de valor de retorno
    public Persona(String _nombre, int _edad){
        nombre = _nombre;
        edad = _edad;
        
        /* Es equivalente a:
                  (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        }
        */
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }
}
