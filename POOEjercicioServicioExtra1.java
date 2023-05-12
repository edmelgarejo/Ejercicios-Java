/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicioservicioextra1;

import pooejercicioservicioextra1.entidad.Raices;
import pooejercicioservicioextra1.entidad.servicio.RaicesServicio;

/**
 *
 * @author MarinaElizabeth
 */
public class POOEjercicioServicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    RaicesServicio RS = new RaicesServicio ();
    Raices r1 = RS.CrearRaiz();
    RS.calcular(r1,RS.getDiscriminante(r1));
    }
    
}
