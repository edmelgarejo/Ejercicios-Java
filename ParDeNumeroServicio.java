/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooutilidadej2.Entidad.Servicio;

import java.util.Scanner;
import pooutilidadej2.Entidad.ClasePardeNumeros;

/**
 *
 * @author W10
 */
public class ParDeNumeroServicio {
    
    ClasePardeNumeros cpdn = new ClasePardeNumeros();
    Scanner leer = new Scanner (System.in);
 
    public void mostrarValores(){
        System.out.println("El numero 1 es "+ cpdn.getNumero1());
        System.out.println("El numero 2 es "+ cpdn.getNumero2());
    }
    public double devolverMayor (){
    return Math.max(cpdn.getNumero1(),cpdn.getNumero2());
}
    public int calcularPotencia (){
        if(devolverMayor() == cpdn.getNumero1()){
           return (int) Math.pow(Math.round(cpdn.getNumero1()), Math.round(cpdn.getNumero2())); 
        }else
            return (int) Math.pow(Math.round(cpdn.getNumero2()), Math.round(cpdn.getNumero1()));
    }
    public void calcularRaiz (){
        System.out.println("La raiz calculada es " +Math.abs(Math.sqrt(Math.min(cpdn.getNumero1(),cpdn.getNumero2()))));
    }
}