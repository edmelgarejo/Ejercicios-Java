/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.control.ej.pkg6;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class EstructuraDeControlEj6 {

    /**
     * @param args the command line arguments
     * Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);//Introducir dato
        Scanner respuesta = new Scanner (System.in);//Lo utilizo para responder S/N
        
        boolean salir = true;//Booleano para que se repita el bucle
        String salir1; //Es para guardar la respuesta S/N y cambia a "false" la variable "boolean Salir"
        
        System.out.println("Introduzca un numero positivo");
        int numero1 = leer.nextInt();//Se guarda el primer numero
        
        System.out.println("Introduzca otro numero entero positivo");
        int numero2 = leer.nextInt();// Se guarda el segundo numero
        
        do{//Encierro todo en el bucle "Do While" para que se repita el men�.
            
            System.out.println("MEN�");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            
            int opcion = leer.nextInt();//guarda la opcion
            
        if (opcion == 5){//condicional "If" para analizar la respuesta
            System.out.println("Estas seguro que deseas salir del programa (S/N)");
            salir1 = respuesta.nextLine();//Guarda la respuesta S/N            
            switch (salir1.toUpperCase()){//toUpperCase me coloca la palabra en mayuscula
                case "S":
                    salir = false;//cambia la variable a "false" para salir del bucle.
                    break;
                case "N":
                    break;//Caso contrario se repite el menú
                } 
            
        } else if (opcion >5){//en el caso de introducir un numero mayor a la cantidad de opciones
            System.out.println("La opcion elegida no responda a ninguna de las establecidas");
            System.out.println("Vuelva a introducir una opcion (1 al 5)");
            
        } else{//Si la condicion no se cumple, desplega el menú
            
            switch (opcion){//Utilizo el "switch" para la accion a realizar con la opcion elegida
              case 1:
                  int suma = numero1 + numero2;
                  System.out.println("La suma es: "+suma);
                  break;
              case 2:
                  double resta = numero1 - numero2;
                  System.out.println("La resta es: "+resta);
                  break;
              case 3:
                  int multiplicacion = numero1*numero2;
                  System.out.println("La multiplicacion es: "+multiplicacion);
                  break;
              case 4:
                  double division = numero1/numero2;
                  System.out.println("La division es: "+division);
                  break;
                        }
                }          
        } while (salir == true);//para salir del bucle la variable salir tiene que ser "false"
    }
       
    }
        
    
  
