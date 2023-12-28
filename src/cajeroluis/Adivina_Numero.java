/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroluis;
import java.util.*;
/**
 *
 * @author luis
 */
public class Adivina_Numero {
    
    public static void main(String[] args) {
        
        //Scanner entrada=new Scanner(System.in);
        
        int aleatorio=(int)(Math.random()*100);        
        System.out.println("Vamos a generar números al ramdon: "+aleatorio);
        Scanner entrada=new Scanner(System.in);
        int numero=0;
        int intentos=0;
        while(numero!=aleatorio)
        {
            System.out.println("Introduce el número que creas es el aleatorio");
            numero=entrada.nextInt();
            intentos++;
            if(aleatorio<numero)
            {
                System.out.println("Mas bajo");
                //intentos++;
                System.out.println("Este es tu número de intentos "+intentos);
            }
            else if(aleatorio>numero)
            {
                System.out.println("Mas alto");
                //intentos++;
                System.out.println("Este es tu número de intentos "+intentos);
            }
            else if(aleatorio==numero)
            {
                System.out.println("Ese es el número Felicitaciones");
                //intentos++;
                System.out.println("Este es tu número de intentos "+intentos);
            }
        }
        
        System.out.println("Felicidades adivinaste y tu cantidad de intentos fuerón: "+intentos);
    }
    
}
