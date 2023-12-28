/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroluis;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author luis
 */
public class Areas {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Elige la opción: \n1:Cuadrado \n2:Rectangulo \n3:Triangulo  \n4:Círculo ");
        
        int figura=entrada.nextInt();
        
        switch(figura)
        {
            case 1:
                double lado=Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println("El area del cuadrado es "+Math.pow(lado, 2));
                break;
            case 2: 
                double base=Double.parseDouble(JOptionPane.showInputDialog("Introduce el tamaño de la base"));
                double altura=Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El area del rectangulo e: "+base*altura);
                break;
                
            case 3:
                base=Double.parseDouble(JOptionPane.showInputDialog("Introcuce la base del triangulo"));
                altura=Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del triangulo"));
                System.out.println("El area del triangulo es"+(base*altura)/2);
                break;
                //double baseT=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del triangulo"));
                //double alturaT=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el tamaño de la atura del triangulo"));
            case 4:
                double radio=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio"));
                System.out.print("El area del circulo es: ");
                System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
                System.out.println("");
                break;
            default:
                    System.out.println("Ingresa una opción correcta");
                
        }
    }
    
}
