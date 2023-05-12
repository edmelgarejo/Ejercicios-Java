/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicioextra5.entidad;

import java.util.Scanner;

/**
 *
 * @author MarinaElizabeth
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcular_aumento (){
        Scanner leer = new Scanner (System.in);
        System.out.println("Introduzca su nombre");
        this.nombre = leer.nextLine();
        
        System.out.println("Intrduzca su salario");
        this.salario = leer.nextDouble();
        
        System.out.println("Introduzca su edad");
        this.edad = leer.nextInt();
        
        if (this.edad > 30){
            System.out.println("Su salario en pesos es de "+(this.salario+(this.salario*0.10)));
        }else if (this.edad < 30){
            System.out.println("Su salario en pesos es de "+(this.salario+(this.salario*0.05)));
        }else{
            System.out.println("Su salario en pesos es de "+this.salario);
        } 
    }    
}
