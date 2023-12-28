/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroluis;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author luis
 */
public class Evalua_edad {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa la edad que tienes");
        int edad=entrada.nextInt();
        //String num1=JOptionPane.showInputDialog("Ingresa tu edad");
        
        if(edad>=18)
        {
            System.out.println("Perro eres mayor de edad");
        }
        else 
        {
            System.out.println("Eres un pollo");
        }
    }
    
}
