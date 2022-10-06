package Sobreescritura;

/**
 *
 * @author Mateo Henao
 */
public class Perro extends Animal {
    @Override
    public void comer(){
        System.out.println("Estoy comiendo en el piso en un platito");
    }
}
