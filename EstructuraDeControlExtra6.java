/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.control.extra.pkg6;

import java.util.Scanner;

/**
 *
 * @author W10
 * 
 */
public class EstructuraDeControlExtra6 {

    /**
     * @param args the command line arguments
     * Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int contadorBajo = 0;
        double promedioBajo = 0;
        double alturaPromedio = 0;
        
        System.out.println("Ingrese la cantidad de personas a ingresar");
        int personas = leer.nextInt();
        
        for (int i=1; i<=personas;i++){
            System.out.println("Ingrese la altura");
            double altura = leer.nextDouble();
            alturaPromedio = alturaPromedio+ altura;
            
            if (altura < 1.60){
            contadorBajo = contadorBajo += 1;
            promedioBajo = promedioBajo + altura;
            }
        }
        System.out.println("El promedio de estaturas que se encuentran por debajo de 1.60 metros es de "+ promedioBajo/contadorBajo);
        System.out.println("El promedio general de estaturas es de "+ alturaPromedio/personas);
            
        
        
        
        
    }
    
}
