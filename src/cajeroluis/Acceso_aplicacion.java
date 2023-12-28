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
public class Acceso_aplicacion {
    
    public static void main(String[] args) {
        String clave="Juan";
        String pass="";
        
       // pass=JOptionPane.showInputDialog("Ingresa la clave Pa");
        
        while(clave.equals(pass)==false)
        {
            pass=JOptionPane.showInputDialog("Introduce la contraseña porfavor");
            if(pass.equals(clave)==false)
            {
                System.out.println("Ingresaste una contraseña incorreta");
            }
            //else
            //{
              //  System.out.println("Welcome to the system");
            //}
        }
        
        System.out.println("Ingresaste al sistema");
    }
    
}
