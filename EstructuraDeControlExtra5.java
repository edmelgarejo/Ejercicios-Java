/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.control.extra.pkg5;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class EstructuraDeControlExtra5 {

    /**
     * @param args the command line arguments
     * Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String tipoSocio;
        String tipoSocio1;
        double importe;
        double descuentoSocio;
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrse su Clase de Socio (A,B o C)");
        tipoSocio = leer.nextLine();
        tipoSocio1 = tipoSocio.toUpperCase();
        
        System.out.println("Introduzca el costo del tratamiento");
        importe = leer.nextInt();
        
        switch (tipoSocio1) {
            case "A":
                descuentoSocio = importe-(importe*0.50);
                System.out.println("El costo del tratamiento en pesos es de $"+ descuentoSocio);
                break;
            case "B":
                descuentoSocio = importe-(importe*0.35);
                System.out.println("El costo del tratamiento en pesos es de $"+ descuentoSocio);
                break;
            default:
                System.out.println("El costo del tratamiento en pesos es de $"+importe);
                break;        
        }
    
}
}