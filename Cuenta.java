/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio.extra4.entidad;

import java.util.Scanner;

/**
 *
 * @author MarinaElizabeth
 */
public class Cuenta {

    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirar_dinero() {
        String Opc = "";
        double aux = saldo;
        saldo = 22500.20;
        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("Cuanto dinero desea extraer");
            double extraccion = leer.nextDouble();

            while (extraccion > this.saldo) {
                System.out.println("La cantidad es mayor al saldo");
                System.out.println("Su saldo en pesos es de " + this.saldo);
                System.out.println("¿Cuanto dinero desea extraer?");
                extraccion = leer.nextDouble();

            }
            aux = this.saldo - extraccion;
            saldo = aux;
            System.out.println("Su saldo es " + saldo);
            System.out.println("Desea realizar otra extraccion? S/N");
            Opc = leer.next();
        } while (Opc.equalsIgnoreCase("s"));
    }
}
