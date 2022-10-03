/*
    Encapsulamiento y metodos accesores (Setters y getters)
    Encapsulamiento: Oculta atributos y metodos para que solo accedan a la misma clase
 */
package paquete1;

/**
 *
 * @author matthenao
 */
public class Clase1 {
    private int edad;
    private String nombre;
    
    //Metodo Setter: Establecer la edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    //Metodo Getter: Mostrar la edad
    public int getEdad(){
        return edad;
    }

    //En netbeans dar click derecho, despues insert code para hacerlo mas rapido
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    } 
}
