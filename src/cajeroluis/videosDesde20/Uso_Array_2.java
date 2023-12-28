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
public class Uso_Array_2 {
    
    public static void main(String[] args) {
        String paises[]=new String[8];
        int aleatorios[]=new int[400];
        int cont=0;
       /* paises[0]="Colombia";
        paises[1]="China";
        paises[2]="España";
        paises[3]="Argentina";
        paises[4]="Mexico";
        paises[5]="USA";
        paises[6]="Chile";
        paises[7]="Ecuador";**/
        
        /*for (int i = 0; i < paises.length; i++) {
            System.out.println(i+ ": pais: "+paises[i]);
        }*/
        
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i]=(int)(Math.random()*100);
        }
        
        for(int recorrido:aleatorios)
        {
            System.out.println(recorrido);
        }
        
        for (int i = 0; i < 8; i++) {
            paises[i]=JOptionPane.showInputDialog("Introduce el nombre dell pais " +(i+1));
        }
        
        for(String elemento:paises)
        {
            cont++;
            System.out.println(cont+" ."+elemento);
        }
        
    }
    
}
