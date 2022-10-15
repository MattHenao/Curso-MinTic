/*
    Polimorfismo
    En una relacion de tipo herencia, una super clase puede amacenar un objeto
    de cualquiera de sus subclases
    Esto quiere decir que la clase padre o super clase es compatible con los
    tipos que derivan de ella, pero no al revess
 */
package Poli;

/**
 *
 * @author Matt Henao
 */
public class Main {
    public static void main(String[] args){
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        //Polimorfismo
        misVehiculos[0] = new Vehiculo("MJE302", "Ferrari", "A19");
        misVehiculos[1] = new VehiculoTurismo("HJS718", "Mercedes Benz", "Turismo 12", 4);
        misVehiculos[2] = new VehiculoDeportivo("LOL122", "Lamborghini", "Veneno", 500);
        misVehiculos[3] = new VehiculoFurgoneta("JNX131", "Toyota", "J2", 2500);
        
        for(Vehiculo vehiculos: misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
    }
}
