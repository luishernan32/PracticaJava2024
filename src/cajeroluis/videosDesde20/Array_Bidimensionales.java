/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroluis.videosDesde20;

/**
 *
 * @author luis
 */
public class Array_Bidimensionales {
    
    public static void main(String[] args) {
        //int matrix[][]=new int[4][5];
        int matrix[][]={{3,4,1,5,5},
            {3,4,1,5,5},
            {3,4,1,5,5},
            {3,4,1,5,5}            
        };
        for (int[] fila : matrix) {

            for (int z : fila) {
                System.out.println(z + "");
            }
        }
       /* matrix[0][0]=45;
        matrix[0][1]=55;
        matrix[0][2]=65;
        matrix[0][3]=55;
        matrix[0][4]=35;
        
        matrix[1][0]=27;
        matrix[1][1]=37;
        matrix[1][2]=37;
        matrix[1][3]=17;
        matrix[1][4]=71;
        
        
        matrix[2][0]=53;
        matrix[2][1]=53;
        matrix[2][2]=35;
        matrix[2][3]=55;
        matrix[2][4]=55;
        
        matrix[3][0]=25;
        matrix[3][1]=25;
        matrix[3][2]=65;
        matrix[3][3]=85;
        matrix[3][4]=85;*/
        
        
        /*for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j]+" ");
                
            }
            
        }*/
        
        
    }
    
}
