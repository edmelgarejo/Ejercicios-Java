/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.control.ej2;

import java.util.Scanner;

/**
 *
 * @author W10
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 */
public class EstructuraDeControlEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);//Introducir el valor por teclado
        System.out.println("Introduzca una frase");//Imrpimir por pantalla el mensaje
        
        String frase = leer.nextLine();//Defino la variable y le asigno el valor por teclado
                
        if (frase.equals("eureka") == true){//Dentro del If comparo con la cadena "eureka" para saber si se cumple la condicion
        System.out.println("Correcto");//Si se cumple
    }
        else{
            System.out.println("Incorrecto");//Si no se cumple
        }
        
    }
    
}
