/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroluis;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Entrada_ejemplo1 {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce tu nombre porfavor");
        String nombre_usuario=entrada.nextLine();
        
        System.out.println("Introduce la edad porfavor");
        int edad=entrada.nextInt();
        
        System.out.println("El nombre de la persona es: "+nombre_usuario+" y su edad es "+edad);
    }
    
}
