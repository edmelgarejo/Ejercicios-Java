/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.control.ej.pkg7;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class EstructuraDeControlEj7 {

    /**
     * @param args the command line arguments
     * Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&�? marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        String salir = "&&&&&";
        String inicial = "X";
        String fin = "O";
        String cadena;
        boolean salir1;
        int FDE = 0;
        int noFDE = 0;
       
        do{//Utilizo el bucle "Do/While" para repetir el proceso
            System.out.println("Introduzca una cadena que contenga como maximo 5 caracteres de largo");

            cadena = leer.nextLine();//guardo el ingreso de dato por teclado
            int longitud = cadena.length();//Saco la longitud de la cadena ingresada
            salir1 = cadena.equalsIgnoreCase(salir);//Comparo las cadenas enviando como respuesta "true" or "false"

            if (longitud <= 5 && salir1 == false){//Si la longitud es igual o menor a 5 y falsa se produce el proceso
            
            String primera = cadena.substring(0,1);//Saca la primer letra de la cadena
            
            String ultima = cadena.substring(longitud-1,longitud);//Saca la ultima letra de la cadena
            
                if(primera.equalsIgnoreCase(inicial) && ultima.equalsIgnoreCase(fin)){//Compara las cadenas
                    FDE = FDE + 1;//al ser un mensaje FDE se acumula el contador
                } else{
                  noFDE = noFDE + 1;//al no ser un mensaje FDE se acumula el contador  
                }
        }else if (longitud > 5 && salir1 == false){//Si supera la cantidad de caracteres, imprime un mensaje.
                System.out.println("La cadena introducida tiene mas de 5 caracteres");
        }
        } while(salir1 == false);//Utilizo una variable booleana para poder salir.
        //En este caso al ser "false" se repite el bucle hasta que sea "verdadera"
        
        System.out.println("La cantidad de mensajes FDE enviados es de: "+FDE);//Cantidad de mensajes correctos
        System.out.println("La cantidad de mensajes FDE incorrectos es de: "+noFDE);//Cantidad de mensajes incorrectos
    }
    
}
