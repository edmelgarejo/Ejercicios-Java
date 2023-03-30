/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprograma.java.ej.pkg1;

import java.util.Scanner;

/**
 *
 * @author Flia Melgarejo
 */
public class SubProgramaJavaEj1 {

    /**
     * @param args the command line arguments
     * Creaunaaplicaciónquelepidadosnúmerosalusuarioyestepueda elegirentresumar,restar,multiplicarydividir.Laaplicacióndebetener unafunciónparacadaoperaciónmatemáticaydebendevolversus resultadosparaimprimirlosenelmain. 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        double retorno;
        
        System.out.println("Introduzca un numero entero");
        int numero1 = leer.nextInt ();
        
        System.out.println("Introduzca otro numero entero");
        int numero2 = leer.nextInt ();
        
        System.out.println("¿Que operación quiere realizar?");
        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicación");
        System.out.println("4-División");
        
        int opcion = leer.nextInt ();
        
    switch (opcion){
        case 1:
            retorno = sumar(numero1, numero2);
            System.out.println("La suma de ambos numeros es "+ retorno);
            break;
        case 2:
            retorno = restar(numero1, numero2);
            System.out.println("La resta de ambos numeros es "+retorno);
            break;
        case 3:
            retorno = multiplicacion(numero1, numero2);
            System.out.println("La multiplicacion de ambos numeros es"+retorno);
            break;
        case 4:   
            retorno = divi(numero1, numero2);
            System.out.println("La multiplicacion de ambos numeros es "+retorno);
            break;
        default:
            System.out.println("La opcion introducida no es valiada");
            break;
    }   
    
}
     public static int sumar(int numero1, int numero2){
        int suma;
        suma = numero1 + numero2;
        return suma;      
    }  
     public static double restar(int numero1,int numero2){
         double resta;
         resta = numero1-numero2;
         return resta;
     }
     public static int multiplicacion(int numero1, int numero2){
         int multiplicacion;
         multiplicacion = numero1*numero2;
         return multiplicacion;
     }
     public static double divi (int numero1, int numero2){
         double division;
         division = numero1/numero2;
         return division;
     }
 }
   