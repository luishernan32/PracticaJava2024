/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author luis
 */
public class Uso_Coche {
    
    public static void main(String[] args) {
        
        Coche Renault=new Coche();
        Coche miCoche=new Coche();
        
        System.out.println(" "+miCoche.getDatosGenerales());
        
        //miCoche.setColor();
        miCoche.setColorBomper("Violeta");
        System.out.println(miCoche.getColorBomper());
        
        System.out.println("Este es el color "+miCoche.getColor());
        //Renault.setRuedas(5);
        
        miCoche.setAsientosCuero("No");
        System.out.println(" "+miCoche.getAsientosCuero());
        
        System.out.println(Renault.dimeLargo());
       // System.out.println("La cantidad de ruedas que tiene esté coche es "+Renault.getRuedas());
        //System.out.println("Este coche tiene "+Renault.ruedas+" ruedas."); No las puedo ver o cambiar por el modificador de acceso private
        
    }
    
}
