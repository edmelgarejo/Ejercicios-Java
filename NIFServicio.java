/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicioservicioextra2.entidades.Servicio;

import java.util.Scanner;
import pooejercicioservicioextra2.entidades.NIF;

/**
 *
 * @author MarinaElizabeth
 */
public class NIFServicio {
    Scanner leer = new Scanner (System.in);
    
    
public NIF crearNIF (){
    NIF n = new NIF();
    System.out.println("Introduzca su DNI");
    n.setDni(leer.nextInt());
    
    int resto = n.getDni()%23;
    //System.out.println(resto);
    
    char [] codigo = new char [23];
    String letras = "TRWAGMYFPDXBNJZSQVVHLCKE";
    
    for (int i = 0; i < 23; i++) {
        codigo [i] = letras.charAt(i);
        if (i == resto){
          n.setLetra(codigo [i]);
        }
    }
    return n; 
}  

public void mostrar (NIF n){
    System.out.println(n.getDni()+"-"+n.getLetra());
}
}
