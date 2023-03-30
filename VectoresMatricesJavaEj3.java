/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresmatrices.java.ej.pkg3;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Flia Melgarejo
 */
public class VectoresMatricesJavaEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);//.useDelimiter("\n");
        Random r = new Random();
        System.out.println("Introduzca el tamaño del vector");
        int tamano = leer.nextInt ();
        int [] vector = new int [tamano];
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        
        for (int i=0;i<=tamano-1;i++){
            //System.out.println("["+vector[i]+"]");
            vector [i] = r.nextInt(99999); //(int)(Math.random()*99999+1);
        }
        
        for (int i=0; i<=tamano-1;i++){
            //System.out.println("["+vector [i]+"]");
         
            if (vector[i]<10){
             num1++;
            }else if (vector[i]>=10 && vector[i]<100){
             num2++;
            }else if (vector[i]>=100 && vector[i]<1000){
             num3++;
            }else if (vector [i]>=1000 && vector[i]<10000){
             num4++;
            }else if (vector [i]>=10000 && vector[i]<100000){
             num5++;
        }
        }
        System.out.println("La cantidad de elementos con 1 digito "+num1); 
        System.out.println("La cantidad de elementos con 2 digitos "+num2); 
        System.out.println("La cantidad de elementos con 3 digitos "+num3); 
        System.out.println("La cantidad de elementos con 4 digitos "+num4); 
        System.out.println("La cantidad de elementos con 5 digitos "+num5); 
    }
    
}
