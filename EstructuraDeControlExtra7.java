/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.control.extra.pkg7;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class EstructuraDeControlExtra7 {

    /**
     * @param args the command line arguments
     * Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int numeros, min = 999, max = 0, cont = 0, valor, suma = 0;
        Double promedios;
        System.out.println("Ingrese la cantidad de numeros a ingresar");
        numeros = leer.nextInt();
        
        while (cont != numeros){
            cont = cont += 1;
            System.out.println("Ingrese un numero");
            valor = leer.nextInt();
            suma = suma + valor;
            if (valor < min) {
                min = valor;
            } else if (valor > max){
                max = valor;
            }       
         }
         System.out.println("El numero minimo es: " + min);
         System.out.println("el numero maximo es: " + max);
         System.out.println("El promedio de los numeros es: " + (suma/numeros));
    }
}
            
