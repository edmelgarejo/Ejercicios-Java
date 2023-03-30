/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectormatrizextra6;

import java.util.Scanner;

/**
 *
 * @author Flia Melgarejo
 */
public class VectorMatrizExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
       String [][] matriz = new String [20][20];
       String palabra;
       int fila = 0;
       int contador = 0;
       
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz [i][j] = Integer.toString((int)(Math.random()*10));
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        do{
            System.out.println("Introduzca una palabra que contenga como minimo 3 y maximo 5 caracteres");
            do{
              palabra = leer.nextLine();
            }while (palabra.length() < 3 || palabra.length() > 5);
          fila = (int)(Math.random()*20);
            System.out.println(fila);
            for (int i = fila-1; i <= fila; i++) {
                for (int j = 0; j < palabra.length(); j++) {
                  matriz [fila][j] = palabra.substring(j, j+1);   
                }  
            }
          contador++;
        }while (contador<5);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("["+matriz [i][j]+"]");  
            }
            System.out.println(""); 
        }
    }
    
}
