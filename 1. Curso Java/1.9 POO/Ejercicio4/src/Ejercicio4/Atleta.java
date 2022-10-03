/*
    Construir un programa para una competencia de atletismo, el programa debe
    gestionar una serie de atletas caracterizados por su numero de atleta,
    nombre y tiempo de carrera, al final el programa debe mostrar los datos del
    atleta ganador de la carrera.
 */
package Ejercicio4;

/**
 *
 * @author matthenao
 */
public class Atleta {
    private int numeroAtleta;
    private String nombre;
    private float tiempoCarrera;
    
    public Atleta(int numeroAtleta, String nombre, float tiempoCarrera){
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }
    
    public float getTiempoCarrera(){
        return tiempoCarrera;
    }
    
    public String mostrarDatosGanador(){
        return "Numero de atleta: " + numeroAtleta + "\nNombre del atleta: " + nombre + "\nTiempo de carrera: " + tiempoCarrera;
    }
}
