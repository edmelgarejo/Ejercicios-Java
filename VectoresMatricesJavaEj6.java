/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos.java.ej.pkg6;

import java.util.Scanner;

/**
 *
 * @author Flia Melgarejo
 */
public class ArreglosJavaEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
    int [][] matriz = new int [3][3];
    int numero;
    int diagonal = 0;
    int fila = 0;
    int columna = 0;
    boolean bandera = true;
            
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do{
                    System.out.println("Introduzca un numero (1 al 9)");
                    numero = leer.nextInt(); 
                }while(numero < 1 || numero > 9); 
                
                matriz [i][j] = numero;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j){
                diagonal+= matriz[i][j]; 
                }
            }
            
        }
        for (int i = 0; i < 3; i++) {
            fila = 0;
            columna = 0;
            for (int j = 0; j < 3; j++) {
                fila+= matriz [i][j];
                columna+= matriz [j][i];                 
             } 
            if (fila != diagonal || columna != diagonal){
                bandera = false;
            }  
        }
    if (bandera == true){
        System.out.println("Es magica");
    }else{
        System.out.println("No es magica");
    }    
    }
    
}
