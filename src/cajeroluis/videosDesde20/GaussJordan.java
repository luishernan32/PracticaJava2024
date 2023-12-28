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
public class GaussJordan {
    public static void main(String[] args) {
        double[][] matriz = {
            {2, 1, -1, 8},
            {-3, -1, 2, -11},
            {-2, 1, 2, -3}
        };

        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            // Escalonamiento: Convertir la diagonal principal a unos
            double divisor = matriz[i][i];
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] /= divisor;
            }

            // Eliminación: Convertir los elementos no diagonales en cero
            for (int k = 0; k < filas; k++) {
                if (k != i) {
                    double factor = matriz[k][i];
                    for (int j = 0; j < columnas; j++) {
                        matriz[k][j] -= factor * matriz[i][j];
                    }
                }
            }
        }

        // Mostrar el resultado
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
