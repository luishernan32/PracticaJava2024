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
public class Adivina_Numero_do_While {
    
    public static void main(String[] args) {
        
        int valor=(int)(Math.random()*100);
        int numero=0;
        int intentos=0;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Esté es el valor que me dio en el random "+valor);
        
        do
        {
            intentos++;
            System.out.println("Ingresa el numero que deseas adivinar");
            numero=entrada.nextInt();
            
            if(valor>numero)
            {
                System.out.println("Ingresa un número mas alto");
            }
            else if(valor<numero)
            {
                System.out.println("Ingresa un número mas bajo");
            }
            else if(valor==numero)
            {
                System.out.println("Adivinaste el número");
            }
            
        }while(valor!=numero);
        System.out.println("La cantidad de intentos fuerón de: "+intentos);
    }
    
}
