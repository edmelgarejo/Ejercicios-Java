/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprograma.java.ej.pkg3;

import java.util.Scanner;

/**
 *
 * @author Flia Melgarejo
 */
public class SubProgramaJavaEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        String moneda;
                
        
        System.out.println("Introduzca el monto en euro a cambiar");
        double monto = leer.nextDouble();
        
        System.out.println("¿A que moneda desea cambiar (libra/dolar/yenes)?");
        moneda = leer.nextLine();
        
        cambio(monto, moneda);   
    }
    public static void cambio(double monto, String moneda){
      double libra = 0.86;
      double dolar = 1.28611;
      double yenes = 129.852; 
     
      
      switch (moneda){
          case "libra":
          System.out.println("El monto en libras es "+monto*libra);
          break;
          case "dolar":
          System.out.println("El monto en dolares es "+monto*dolar);
          break;
          case "yenes":
          System.out.println("El monto en yenes es "+monto*yenes);
          break;
          default:
            System.out.println("El tipo de cambio no es valido");
            break;
    }
}
}
