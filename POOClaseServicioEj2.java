/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclaseservicioej2;

import java.util.Scanner;
import pooclaseservicioej2.entidad.Cafetera;
import pooclaseservicioej2.entidad.servicio.CafeteraServicio;

/**
 *
 * @author MarinaElizabeth
 */
public class POOClaseServicioEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera c1 = cs.LlenarCafetera();
        
        System.out.println("Introduzca el tamaño de la taza en litros");
        System.out.println("Taza = 2.5 litros");
        System.out.println("Posillo = 1 litro");
        float t = leer.nextFloat();
        cs.LlenarTaza(c1,t);
        
        cs.VaciarCafetera(c1);
        
        System.out.println("Ingrese la cantidad de cafe");
        float i = leer.nextInt(); 
        cs.AgregarCafe(c1,i);
        
        
       
    }
    
}
