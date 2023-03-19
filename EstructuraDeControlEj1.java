/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.control.ej.pkg1;

import java.util.Scanner;

/**
 *
 * @author W10
 * Crear un programa que dado un número determine si es par o impar.
 */
public class EstructuraDeControlEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Introduzca un numero entero positivo");
        double numero1 = leer.nextInt();
        
        if (numero1%2 == 0){
            System.out.println("El numero ingreso es par");     
    }   else{
            System.out.println("El numero ingresado no es par");
        }
    }
}
