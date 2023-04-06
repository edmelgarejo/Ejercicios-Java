/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio4;

import pooejercicio4.entidad.Rectangulo;

/**
 *
 * @author MarinaElizabeth
 */
public class POOEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo r1 = new Rectangulo ();
        r1.cargarDatos();
        System.out.println("La base es "+r1.base());
        System.out.println("La altura es "+r1.perimetro());
        r1.dibujar();
    }
    
}
