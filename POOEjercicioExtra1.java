/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicioextra1;

import pooejercicioextra1.entidad.Cancion;

/**
 *
 * @author MarinaElizabeth
 */
public class POOEjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cancion c1 = new Cancion ();
        c1.cargarDatos();
        System.out.println(c1.toString());
    }
    
}
