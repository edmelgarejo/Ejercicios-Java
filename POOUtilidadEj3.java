/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooutilidadej3;

import pooutilidadej3.Servicio.ArregloServicio;

/**
 *
 * @author W10
 */
public class POOUtilidadEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArregloServicio as = new ArregloServicio();
        int [] arregloA = new int [50];
        int [] arregloB = new int [20];
        
        as.inicialiarA(arregloA);
        as.mostrarArreglo(arregloA);
        as.ordenarArreglo(arregloA);
        as.rellenarB(arregloA, arregloB);
}
}