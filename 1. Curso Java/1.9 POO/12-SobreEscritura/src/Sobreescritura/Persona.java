package Sobreescritura;

/**
 *
 * @author Mateo Henao
 */
public class Persona extends Animal {
    
    //@Override significa que estamos sobreescribiendo el metodo
    @Override
    public void comer(){
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }
}
