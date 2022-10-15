package Ejemplo;

/**
 *
 * @author gamep
 */
public class Main {
    public static void main(String[] args){
        Planta planta = new Planta();
        AnimalCarnivoro animalC = new AnimalCarnivoro();
        
        animalC.alimentarse();
        planta.alimentarse();
    }   
}
