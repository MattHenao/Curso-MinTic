/*
    Si se pone final cuando se crea una clase, no puede heredar mas clases de
    este tipo

    Si se pone final en algun metodo, los hijos no pueden crear mas metodos
    con ese nombre
*/
package Figuras;

/**
 *
 * @author Mateo Henao
 */

/*final*/public class FiguraCerrada extends Figura{
    private int nLados;

    public FiguraCerrada(int nLados, double tamaño) {
        super(tamaño);
        this.nLados = nLados;
    }
    
    public /*final*/ void dibujar(){
        System.out.println("Dibujo de una figura cerrada");
    }
}
