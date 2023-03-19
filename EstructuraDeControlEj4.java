/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.control.ej.pkg4;

import java.util.Scanner;

/**
 *
 * @author W10
 * Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 */
public class EstructuraDeControlEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        String palabra1 = "A";//Variable que contiene la comparacion
        System.out.println("Introduzca una fase o palabra");//Inbtroduccion de dato por teclado
        String frase = leer.nextLine();//Asignacion de variable para guardar el dato
        String palabra = frase.substring(0,1);//Busca en la cadena la primera letra
        
        if (palabra.equalsIgnoreCase(palabra1)== true){//Compara dos variables y si es verdadero
            System.out.println("CORRECTO");//Imprime el mensaje de CORRECTO
        }else{
            System.out.println("INCORRECTO");//Caso contrario INCORRECTO
        }
        
    }
    
}
