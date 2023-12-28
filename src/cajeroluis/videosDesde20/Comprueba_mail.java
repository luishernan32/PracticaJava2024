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
public class Comprueba_mail {
    
    public static void main(String[] args) {
        boolean punto = false;
        int arroba = 0;
        String mail = JOptionPane.showInputDialog("Omgresa el mail porfavor");

        for (int i = 0; i < mail.length(); i++) {

            if (mail.charAt(i) == '@') {
                arroba++;
            }
            if (mail.charAt(i) == '.') {
                punto = true;
            }
        }
        if (arroba == 1 && punto) {
            System.out.println("Es correcto tienes una arroba");
        } else { 
            System.out.println("Ingresa un correo valido");
        }
    }

}
