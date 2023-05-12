/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclaseservicioej1.entidad.servicio;

import java.util.Scanner;
import pooclaseservicioej1.entidad.CuentaBancaria;

/**
 *
 * @author MarinaElizabeth
 */
public class CuentaBancariaServicio {
    Scanner leer = new Scanner (System.in);  
    public CuentaBancaria CrearCuenta (){
        //Scanner leer = new Scanner (System.in);
        CuentaBancaria cb = new CuentaBancaria();
       
        System.out.println("Introduzca numero de cuenta");
        cb.setNumeroCuenta(leer.nextInt());
        
        System.out.println("Introduzca numero de DNI");
        cb.setDniCliente(leer.nextInt());
        
        System.out.println("Introduzca su saldo actual");
        cb.setSaldoActual(leer.nextDouble());
       
        return cb;
    }
    
    public void ingresar (CuentaBancaria cb, double ingresoDinero){
        
        double nuevoSaldo =  cb.getSaldoActual()+ingresoDinero;
        cb.setSaldoActual(nuevoSaldo);
    }
    public void retirar (CuentaBancaria cb, double retirar){
        if (retirar > cb.getSaldoActual()){
            retirar = cb.getSaldoActual();
        }
        //double nuevoSaldo = cb.getSaldoActual()-retirar;
        cb.setSaldoActual(cb.getSaldoActual()-retirar);
    }
    public void extraccionRapida (CuentaBancaria cb){
       
        System.out.println("Introduzca el monto a retirar");
        double extraccion = leer.nextDouble();
        
        if (extraccion > .2*cb.getSaldoActual()){
            System.out.println("El monto es mayor al 20% de su saldo actual");
            extraccion = .2*cb.getSaldoActual();
            System.out.println("El monto de extraccion es de "+extraccion);
            
        }
        double nuevoSaldo = cb.getSaldoActual()-extraccion;
        cb.setSaldoActual(nuevoSaldo);
    }
    public void consultarSaldo (CuentaBancaria cb){
        System.out.println("Su saldo en dolares es de "+cb.getSaldoActual());
    }
    public void mostrarDatos (CuentaBancaria cb){
        System.out.println(cb.toString());
    }
}
