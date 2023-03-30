/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores.matrices.java.ej.pkg4;

/**
 *
 * @author Flia Melgarejo
 */
public class VectoresMatricesJavaEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matrizA = new int[4][4];
        int [][] matrizB = new int [4][4];
        
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                matrizA[i][j]= (int)(Math.random()*9+1);
            }
        }
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
              System.out.print("["+matrizA[i][j]+"]");
              matrizB[j][i] = matrizA [i][j];
            }
            System.out.println("");
        }
       for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
              System.out.print("["+matrizB[i][j]+"]");  
            }
            System.out.println("");
        } 
        
    }
}
