/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double number;
        System.out.println("Introduzca un numero entero porsitivo");
        Scanner read = new Scanner (System.in);
        //Para que me muestre el numero ingresado utilizo el next acompañado del tipo de dato
        // en este caso Double
        number = read.nextDouble();
        //Me entrega el doble del numero por medio de la funcion Math.pow
        //donde coloco el numero ingresado elevado a la 2
        System.out.println("Su doble es " + Math.pow(number,2));
        //Me entrega el doble del numero por medio de la funcion Math.pow
        //donde coloco el numero ingresado elevado a la 3
        System.out.println("Su triple es " + Math.pow(number,3));
        //La funcion Math.sqrt me permite calcular la raiz cuadrada del numero ingresado
        System.out.println("Su raiz cuadrada es " + Math.sqrt(number));
        
        
        
    }
    
}
