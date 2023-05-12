/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicioservicioextra2;

import pooejercicioservicioextra2.entidades.NIF;
import pooejercicioservicioextra2.entidades.Servicio.NIFServicio;

/**
 *
 * @author MarinaElizabeth
 */
public class POOEjercicioServicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NIFServicio nifs = new NIFServicio ();
        
        NIF n1 = nifs.crearNIF();
        nifs.mostrar(n1);
    } 
}
