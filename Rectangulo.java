/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicioextra6.entidad;

import java.util.Scanner;

/**
 *
 * @author MarinaElizabeth
 */
public class Rectangulo {
   public int lado1;
   public int lado2;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
 
   public void calcular_area(){
       Scanner leer = new Scanner (System.in);
       System.out.println("Introduzca la base de rectangulo");
       lado1 = leer.nextInt();
       
       System.out.println("Introduzca el altura del rectangulo");
       lado2 = leer.nextInt();
       
       double area = lado1*lado2;
       System.out.println("El area del rectangulo es "+ area);
       
       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 6; j++) {
               if (i != 0 || j != 0 || i != 3 || j != 5){
                   System.out.print(" * ");
               }else{
                   System.out.print(" ");
               }
           }
           System.out.println("");
       }
       
   }
    
    
}
