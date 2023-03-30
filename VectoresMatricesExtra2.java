/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresmatricesextra2;

import java.util.Scanner;

/**
 *
 * @author Flia Melgarejo
 */
public class VectoresMatricesExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer = new Scanner (System.in);
     
        System.out.println("Introduzca el tamaño de los vectores");
        int n = leer.nextInt();
        
        int [] vectorA = new int [n];
        int [] vectorB = new int [n];
        
        for (int i = 0; i < n; i++) {
            vectorA [i] = (int)(Math.random()*9+1);
            vectorB [i] = (int)(Math.random()*9+1);
        }
        for (int i = 0; i < n; i++) {
            System.out.print("["+vectorA [i]+"]");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print("["+vectorB [i]+"]");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            if (vectorA [i] != vectorB [i]){
                System.out.println("No son iguales los vectores");
             break;   
            }   
        }
     
    }
    
}
