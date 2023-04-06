/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio4.entidad;

import java.util.Scanner;

/**
 *
 * @author MarinaElizabeth
 */
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void cargarDatos (){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la base del rectangulo");
        base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        altura = leer.nextDouble();
    }
    public double base (){
        return (base*altura);
    }
    public double perimetro(){
        return ((base+altura)*2);
    }
    public void dibujar(){
    
        for (int i = 0; i < base; i++) {
                for (int j = 0; j < altura ; j++) {
                   if (i == 0 || i == base-1 || j == 0 || j == altura-1){
                       System.out.print("* ");
                   }else System.out.print("  "); 
                 }
                System.out.println("");
        }
    }
}


