/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.control.extra.pkg8;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class EstructuraDeControlExtra8 {

    /**
     * @param args the command line arguments
     * Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        double suma = 0; 
        int contadorPar = 0;
        int contador = 0;
        int contadorNum = 0;
        
        System.out.println("Introduzca un numero entero");
          double numero = leer.nextInt();
          
        while (numero < 0 || numero > 0){
            if(numero > 0){
            suma = suma + numero;
            contadorNum = contadorNum +=1;
            }             
            if (numero%5 == 0){
                break;
            } else if (numero%2 == 0 && numero > 0){
                 contadorPar = contadorPar +=1;
             }else if(numero > 0){
                 contador = contador +=1;
             }
        System.out.println("Introduzca otro numero");
        numero = leer.nextInt();
        }
        System.out.println("La cantidad de numeros pares es " + contadorPar);
        System.out.println("La cantidad de numeros impares es "+ contador);
        System.out.println("La cantidad de numero leidos es " +contadorNum);  
    }
    
}
