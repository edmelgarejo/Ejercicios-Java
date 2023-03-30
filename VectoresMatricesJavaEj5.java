/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores.matrices.java.ej.pkg5;

/**
 *
 * @author Flia Melgarejo
 */
public class VectoresMatricesJavaEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matrizA = new int [3][3];
        int [][] matrizB = new int [3][3];
        boolean bandera;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA [i][j]= (int)(Math.random()*9+1);
                //matrizB [j][i]= matrizA [i][j]*-1;
                if(matrizB [j][i]== matrizA [i][j]*-1){
                   bandera = true; 
                }else{
                    bandera = false;
                } 
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matrizA[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matrizB[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
    
}
}