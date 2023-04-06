package pooejercicio3.entidad;

import java.util.Scanner;

public class Operacion {

    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        numero1 = leer.nextDouble();
        System.out.println("Ingrese el segundo numero");
        numero2 = leer.nextDouble();
    }

    public double sumar() {
        return (numero1 + numero2);
    }

    public double resta() {
        return (numero1 - numero2);
    }

    public double multiplicacion() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("La multiplicacion no se puede realizar ya que uno de los valores es 0");
            return (0);
        } else return (numero1 * numero2);
    }
        


    public double division() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("La division no se puede realizar ya que uno de los valores es 0");
            return (0);
        } else return (numero1 / numero2);
    }
}



