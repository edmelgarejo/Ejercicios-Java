/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresmatricesextra.pkg1;

import java.util.Scanner;

/**
 *
 * @author Flia Melgarejo
 */
public class VectoresMatricesExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
      int suma = 0;
      
        System.out.println("Introduzca el tamaño del vector");
        int tamano = leer.nextInt();
        int [] vector = new int [tamano];
        
        for (int i = 0; i < tamano; i++) {
            System.out.println("Introduzca un numero");
            vector [i] = leer.nextInt();
            suma+= vector[i];
        }
        for (int i = 0; i < tamano; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
        System.out.println("La suma de todos los subindices es "+suma);
    }
    
}
