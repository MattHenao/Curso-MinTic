/*
 * En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los $300
 * Cual sera la cantidad que pagara una persona por su compra?
 */

package com.mycompany.ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author matthenao
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        float precio, descuento;
        
        precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del producto: "));
        
        if(precio > 300){
            descuento = precio * 0.20f;
            precio -= descuento;
            JOptionPane.showMessageDialog(null, "El precio de compra es: " + precio);
        }
        else{
            JOptionPane.showMessageDialog(null, "El precio de compra es " + precio);
        }
    }
}
