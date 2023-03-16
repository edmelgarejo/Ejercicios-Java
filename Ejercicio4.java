/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double grado;
        System.out.println("Ingrese la temperatura en ºC");
        Scanner leer = new Scanner (System.in);
        grado = leer.nextDouble();
        System.out.println("El equivalente en grados farenhein es " + (32+(9*grado/5))+ " ºF");
        
       
       
                
    }
    
}
