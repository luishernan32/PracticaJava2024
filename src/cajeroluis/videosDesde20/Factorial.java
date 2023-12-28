/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroluis.videosDesde20;
import javax.swing.*;
/**
 *
 * @author luis
 */
public class Factorial {
    
    public static void main(String[] args) {
        double resultado=1;
        double numero=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el número que deseas averiguar el factorial"));
        
        for (double i = numero; i>0; i--) {
            resultado*=i;
        }
        System.out.println("El resultado de "+numero+"es "+resultado);
    }
    
}
