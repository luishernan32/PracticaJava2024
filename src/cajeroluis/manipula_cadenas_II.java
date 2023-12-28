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
public class manipula_cadenas_II {
    public static void main(String[] args) {
        String frase="Hoy es un estupendo día para aprender a programar en java";
        String frase_resumen=frase.substring(1, 6);
        String frase_resumen_II=frase.substring(0,29)+"Irnos a la playa y olvidarnos de todo"
                +" y "+ frase.substring(29,57);
        
        System.out.println("Esté va a ser el resultado: "+frase_resumen_II);
    }
    
}
