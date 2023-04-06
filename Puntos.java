/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicioextra2.entidad;

import java.util.Scanner;

/**
 *
 * @author MarinaElizabeth
 */
public class Puntos {
    public double x1;
    public double x2;
    public double y1;
    public double y2;
    

    public Puntos() {
    }

    public Puntos(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
   
    }
    public void cargarPuntos (){
        Scanner leer = new Scanner (System.in);
        System.out.println("Indroduzca la coordenada X1/Y1");
        x1 = leer.nextDouble();
        y2 = leer.nextDouble();
        
        System.out.println("Introduzca la coordenada X2/Y2");
        x2 = leer.nextDouble();
        y2 = leer.nextDouble();
    }
    public double distanciaPuntos (){
        
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        
    }
    
}
