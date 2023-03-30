/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectormatricesextra5;

import java.util.Scanner;

/**
 *
 * @author Flia Melgarejo
 */
public class VectorMatricesExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int suma = 0;

        System.out.println("Introduzca el tamaÃ±o de la matriz");
        int n = leer.nextInt();
        int m = leer.nextInt();

        int[][] matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Introduzca un numero");
                matriz[i][j] = leer.nextInt();
                suma += matriz[i][j];
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("La suma de todos los subindices es " + suma);
    }
}
