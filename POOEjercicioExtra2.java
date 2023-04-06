/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicioextra2;

import pooejercicioextra2.entidad.Puntos;

/**
 *
 * @author MarinaElizabeth
 */
public class POOEjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Puntos P = new Puntos ();
        P.cargarPuntos();
        System.out.println("La distancia entre los puntos es "+P.distanciaPuntos());
        
    }
    
}
