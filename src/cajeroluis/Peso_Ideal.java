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
public class Peso_Ideal {
    
    public static void main(String[] args) {
        
        //double estatura=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu altura en cm"));        
        //double peso=estatura-110;        
        //System.out.println("Tu peso ideal seria de "+peso);
        String genero="";
        
        do
        {
            genero=JOptionPane.showInputDialog("Ingresa el genero");
           
            
            /*if(genero.equals("H"))
            {
                double estatura=Double.parseDouble(JOptionPane.showInputDialog("Introduce tu estatura"));
                double peso=estatura-110;                
            }
            else if(genero.equals("F"))
            {
               double estatura=Double.parseDouble(JOptionPane.showInputDialog("Introduce la estatura"));
                double peso=estatura-110;
            }*/
            
        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("F")==false);
        
        double estatura=Double.parseDouble(JOptionPane.showInputDialog("Introduce la estatura en cm "));
        double peso=0;
        if(genero.equalsIgnoreCase("H"))
        {
            peso=estatura-110;
            System.out.println("Tu peso ideas es de "+peso);
        }
        else if(genero.equalsIgnoreCase("F"))
        {
            peso=estatura-120;
            System.out.println("Tu peso ideas es de "+peso);
        }
        
    }
    
}
