/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclaseservicioej1;

import java.util.Scanner;
import pooclaseservicioej1.entidad.CuentaBancaria;
import pooclaseservicioej1.entidad.servicio.CuentaBancariaServicio;

/**
 *
 * @author MarinaElizabeth
 */
public class POOClaseServicioEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        CuentaBancaria c1 = cbs.CrearCuenta();
        
        System.out.println("Indique el monto a ingresar");
        double d = leer.nextDouble(); 
        cbs.ingresar(c1,d);
        System.out.println(c1.toString());
        
        System.out.println("Indique el monto a retirar");
        double c = leer.nextDouble();
        cbs.retirar(c1,c);
        System.out.println(c1.toString());
        
        cbs.extraccionRapida(c1);
        System.out.println(c1.toString());
        
        cbs.consultarSaldo(c1);
        
        cbs.mostrarDatos(c1);
    }
    
}
