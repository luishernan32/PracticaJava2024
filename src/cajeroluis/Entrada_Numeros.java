/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroluis;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Entrada_Numeros {
    public static void main(String[] args) {
        double x=1000;
        
        System.out.printf("%1.3f ",x/3);
        
        String num1=JOptionPane.showInputDialog("Introduce un númemro");
        double numero=Double.parseDouble(num1);
        System.out.println("");
        System.out.printf("%1.3f",x/3);
        System.out.println("La raiz cuadrada de ese número es");
        System.out.printf("%14f",Math.sqrt(numero));
    }
}
