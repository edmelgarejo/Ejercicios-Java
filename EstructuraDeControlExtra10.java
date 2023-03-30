/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.control.extra.pkg10;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class EstructuraDeControlExtra10 {

    /**
     * @param args the command line arguments
     * Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
       int numero1 = (int)(Math.random()*10+0);
       int numero2 = (int) (Math.random()*10+0);
       int multiplicacion = numero1*numero2;
       int adivine;
       
       do{
           System.out.println("Adivine el resultado de la multiplicación");
           adivine = leer.nextInt();
           if(multiplicacion == adivine){
               System.out.println("CORRECTO");
           }else{
               System.out.println("INCORRECTO");
           }
       }while (multiplicacion != adivine);
    }
    
}
