package paquete1;

/**
 *
 * @author matthenao
 */
public class Clase2 {
    public static void main(String [] args){
        Clase1 objeto1 = new Clase1();
        
        objeto1.setEdad(19);
        System.out.println("La edad es " + objeto1.getEdad());
        
        objeto1.setNombre("Mateo");
        System.out.println("EL nombre es: " + objeto1.getNombre());
    }
}
