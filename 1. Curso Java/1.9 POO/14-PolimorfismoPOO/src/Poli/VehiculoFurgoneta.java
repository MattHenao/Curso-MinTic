package Poli;

/**
 *
 * @author Matt Henao
 */
public class VehiculoFurgoneta extends Vehiculo {
    private int carga;
    
    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga){
        super(matricula, modelo, marca);
        this.carga = carga;
    }
    
    public int getCarga(){
        return carga;
    }
    
    @Override
    public String mostrarDatos(){
        return "Marca: " + marca + 
                "\nMatricula: " + matricula +
                "\nModelo: " + modelo +
                "\nCarga: " + carga;
    }
}
