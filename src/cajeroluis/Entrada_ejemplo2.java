/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroluis;
import javax.swing.*;
/**
 *
 * @author luis
 */
public class Entrada_ejemplo2 {
    public static void main(String[] args) {
        //String usuario="";
        String usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
        String edad=JOptionPane.showInputDialog("Introduce tu edad");
        int edad_usuario=Integer.parseInt(edad);
        
        System.out.println("tu nombre es: "+usuario+" tienes "+(edad_usuario+1)+" años"+"");
    }
    
}
