/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.control.ej.pkg5;

import java.util.Scanner;

/**
 *
 * @author W10
 * 
 */
public class EstructuraDeControlEj5 {

    /**
     * @param args the command line arguments
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un valor limite positivo");
        int limite = leer.nextInt();
        int numero1 = 0;
        do{
            System.out.println("Introduzca un/otro numero");
            int numero = leer.nextInt();
            numero1 = numero1 + numero;
        }while (numero1 <= limite);
        System.out.println("Supero el limite positivo ingresado");
    }   
}
