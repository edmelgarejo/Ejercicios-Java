/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.control.extra.pkg3;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class EstructuraDeControlExtra3 {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int longitud;
        Scanner leer = new Scanner (System.in);
        String vocal = "AEIOU";
        String vocal1;
        String letra;
        int contador = 0;
        
        do{
            System.out.println("Introduzca una letra");
            letra = leer.nextLine();
            longitud = letra.length();
        }while (longitud > 1 || longitud < 1);
        
        for (int i = 0; i<=4; i++){
        vocal1 = vocal.substring(i,i+1);
        if (vocal1.equalsIgnoreCase(letra)){
            System.out.println("La letra introducida es Vocal");
            break;
        } else if (i == 4){
              System.out.println("La letra introducida no es vocal");   
        }   
    }
}
}