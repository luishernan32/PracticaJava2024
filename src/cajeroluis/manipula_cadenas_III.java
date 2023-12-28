/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroluis;

/**
 *
 * @author luis
 */
public class manipula_cadenas_III {
    
    public static void main(String args[])
    {
        String nombre1="Luis";
        String nombre2="Luis";
        String nombre3="luis";
        System.out.println(nombre1.equals(nombre2));
        System.out.println(nombre1.equalsIgnoreCase(nombre3));  //Es para ignorar entre mayusculas y minusculas
    }
    
}
