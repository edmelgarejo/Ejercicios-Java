/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.control.extra.pkg1;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class EstructuraDeControlExtra1 {

    /**
     * @param args the command line arguments
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dias, horas,minutosFaltantes;   
        Scanner leer = new Scanner (System.in);
        System.out.println("Introduzca el tiempo en minutos");
        int minutos = leer.nextInt();
        
        horas = (minutos%1440)/60;
        dias = minutos/1440;
        minutosFaltantes = minutos%60;
        
        System.out.println("Dias: "+ dias + " Horas: "+horas + " Minutos: "+ minutosFaltantes);
        
        
        
    }
    
}
