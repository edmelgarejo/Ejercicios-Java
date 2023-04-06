/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio.n.pkg1;

import java.util.Scanner;
import pooejercicio.n.pkg1.entidades.Libro;

/**
 *
 * @author MarinaElizabeth
 */
public class POOEjercicioN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        Libro l1 = new Libro();
        l1.cargaLibro();
        l1.mostrarLibro();
    }
    
}
