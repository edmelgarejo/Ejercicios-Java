/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        System.out.println("Introduzca su nombre");
        Scanner leer = new Scanner(System.in);
        nombre = leer.next();
        System.out.println("Su nombre es " + nombre);
    }
    
}
