/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclaseservicioej2.entidad.servicio;

import java.util.Scanner;
import pooclaseservicioej2.entidad.Cafetera;

/**
 *
 * @author MarinaElizabeth
 */
public class CafeteraServicio {
    Scanner leer = new Scanner (System.in);
    
    Cafetera cs = new Cafetera ();
    
    public Cafetera LlenarCafetera (){
        System.out.println("Recargando Cafetera");
    if (cs.getCantidadActual()== 0){
    float recarga = cs.getCapacidadMaxima();  
    }   
    float recarga = cs.getCapacidadMaxima()- cs.getCantidadActual();
    cs.setCantidadActual(recarga);
        return cs;
    }
    
    public void LlenarTaza (Cafetera cs, float LlenarTaza){
        if (LlenarTaza > cs.getCantidadActual()){
            System.out.println("No alcanza");
            LlenarTaza = cs.getCantidadActual();
            System.out.println("No se lleno. faltó "+(LlenarTaza-cs.getCantidadActual()));
        }
        cs.setCantidadActual(cs.getCantidadActual()-LlenarTaza);
    }
    public void VaciarCafetera (Cafetera cs){
        System.out.println("Vaciando Cafetera");
        cs.setCantidadActual(0);
    }
    public void AgregarCafe (Cafetera cs, float ingreseCafe){
        while((ingreseCafe+cs.getCantidadActual()) > cs.getCapacidadMaxima()){
            System.out.println("La cantidad ingresada es mayor a la capacidad maxima");
            System.out.println("Ingrese nuevamente la cantidad de cafe");
            ingreseCafe = leer.nextFloat();
        }
        cs.setCantidadActual(ingreseCafe);
    }
}
