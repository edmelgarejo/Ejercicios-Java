/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.control.extra.pkg4;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class EstructuraDeControlExtra4 {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int equivalente;
        Scanner leer = new Scanner(System.in);
        
        do{
        System.out.println("Introduca un numero entre 1 y 10");
        equivalente = leer.nextInt();
        
    }while (equivalente < 1 || equivalente > 10);
    
        switch (equivalente){
            case 1:
                System.out.println("Su equivalente en numeros romanos es I");
                break;
            case 2:
                System.out.println("Su equivalente en numeros romanos es II");
                break;
            case 3:
                System.out.println("Su equivalente en numeros romanos es III");
                break;
            case 4:
                System.out.println("Su equivalente en numeros romanos es IV");
                break;
            case 5:
                System.out.println("Su equivalente en numeros romanos es V");
                break;
            case 6:
                System.out.println("Su equivalente en numeros romanos es VI");
                break;
            case 7:
                System.out.println("Su equivalente en numeros romanos es VII");
                break;
            case 8:
                System.out.println("Su equivalente en numeros romanos es VIII");
                break;
            case 9:
                System.out.println("Su equivalente en numeros romanos es IX");
                break;
            case 10:
                System.out.println("Su equivalente en numeros romanos es X");
                break;
        }
}
}