/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooutilidadej3.Servicio;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author W10
 */
public class ArregloServicio {
    public void inicialiarA (int[]a){
        for (int i = 0; i < a.length; i++) {
        a[i]=(int)(Math.random()*50);
        }
    }
    public void mostrarArreglo (int[]a){
        for (int i = 0; i < a.length; i++) {
            System.out.print("Arreglo A: "+"["+a[i]+"]");
        }
        System.out.println("");
    }
    public void ordenarArreglo (int[]a){
        Arrays.sort(a); 
        int i = 0;
        int j = a.length - 1;
        int aux;
        while (i < j) { 
            aux = a[i];
            a[i] = a[j];
            a[j] = aux;
            i++;
            j--;
//        Arrays.sort(a);
//        int [] auxA = new int [50];
//        int cont = 49;
//        
//        for (int i = 0; i > a.length; i++) {
//            auxA [cont] =  a[i]; 
//            cont--;
//        }

    }
        for (int k = 0; k < a.length; k++) {
           System.out.print("A["+k+"]"+"["+a[k]+"] ");   
        }
         System.out.println("");
    }
    public void rellenarB (int []a, int[]b){
        for (int i = 0; i < 10; i++) {
             b[i] = a [i];
    }
    Arrays.fill(b,10,20,5);
        for (int i = 0; i < 20; i++) {
            System.out.print("Arreglo B: "+"["+b[i]+"]");
        }
        System.out.println("");
}
}