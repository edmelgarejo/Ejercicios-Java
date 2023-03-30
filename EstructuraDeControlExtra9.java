/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.control.extra.pkg9;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class EstructuraDeControlExtra9 {

    /**
     * @param args the command line arguments
     * Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
¿Aún no lo entendiste? Recomendamos googlear división con restas
sucesivas.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int contador = 0;
        
        System.out.println("Introduzca el dividendo");
        int dividendo = leer.nextInt();
        
        System.out.println("Introduzca el divisor, debe ser menor al dividendo");
        int divisor = leer.nextInt();
        
        do{
        int resta = dividendo - divisor;
        dividendo = resta;
        contador = contador += 1;
        }while(dividendo > divisor);
        
        System.out.println("Dado que " + dividendo +" es menor que "+ divisor +", entonces: el residuo es " + dividendo + " y el cociente es " +
contador);
    }
}

