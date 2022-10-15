package Poli;

/**
 *
 * @author Matt Henao
 */
public class VehiculoTurismo extends Vehiculo {
        private int nPuertas;
    
    public VehiculoTurismo(String matricula, String marca, String modelo, int nPuertas){
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }
    
    public int nPuertas(){
        return nPuertas;
    }
    
    @Override
    public String mostrarDatos(){
        return "Marca: " + marca + 
                "\nMatricula: " + matricula +
                "\nModelo: " + modelo +
                "\nNumero de puertas: " + nPuertas;
    }
}
