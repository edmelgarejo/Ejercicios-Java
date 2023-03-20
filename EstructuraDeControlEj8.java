/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.control.ej8bis;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class EstructuraDeControlEj8bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);//Es para introducir datos por teclado.
        int numero;//Variable que me vaalmacenar la dimension del cuadrado.
        
        System.out.println("Introduzca un numero entero positivo (dimensiones del cuadrado), mayor a 2");
        numero = leer.nextInt();//El usuario introduce el numero
        
        while (numero <= 2){//El numero tiene que ser mayor a 2 para lograr el cuadrado.
          System.out.println("Introduzca un numero entero positivo (dimensiones del cuadrado), mayor a 2");
        numero = leer.nextInt();//El usuario vuelve a introducir el numero ya que fué menor o igual a 2.  
        }
        
        for (int i = 1; i <= numero; i++){//Este bucle se ejecutará segun el numero introducido
            if (i == 1 || i == numero){//Condicion, si es igual a 1 o numero me tiene que imprimir los "*".
            for (int k = 1; k <= numero; k++){ //El bucle para que imprima los "*" hasta llegar a numero.
                System.out.print(" * ");
            }
                System.out.println("");//Es para generar el salto de linea, caso contrario se imprimiría todo en la misma.
            }else{
                int contador = 0;//Contador para cortar el Bucle.
                for (int q = numero-2; q >= 0; q--){//Se ejecuta y disminuye hasta que contador sea = 2
                    System.out.print(" * ");//Imprime los "*"
                    contador = contador + 1;//Cuenta las iteraciones del bucle.
                    if (contador == 2)//Si contador=2 se produce la salida del bucle hasta la linea 49
                        break;
                    for (int j = numero-3; j >= 0; j--){//Este bucle imprime los espacios.
                        System.out.print("   ");
                    }
                }
                if (i != 1 || i != numero){//Si i es distinto del primer numero y el ultimo
                    System.out.println("");//Realiza el salto de linea.
                }
            }
        }
    }
    
}

