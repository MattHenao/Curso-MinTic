/*
  La sentencia if:

    if(Condicional){
        Intruccion1;
    }
    else{
        Intruccion2;
    }
 * "==" es igualdad, "!=" es desigualdad, ">" es mayor a, "<" es menor a
 * ">=" mayoor o igual a, "<=" menor o igual a. 
 */

package com.mycompany.ifelse;

import javax.swing.JOptionPane;

/**
 *
 * @author matthenao
 */
public class App {

    public static void main(String[] args) {
        int numero, dato = 5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if(numero == dato){
            JOptionPane.showMessageDialog(null, "El numero es 5");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
        }
    }
}
