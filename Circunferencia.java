package pooejercicio2.entidad;

import java.util.Scanner;

public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void cargaCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia");
        radio = leer.nextDouble();
    }

    public double area() {
        return (Math.pow(Math.PI * this.radio, 2));
    }

    public double perimetro() {
        return (2 * Math.PI * this.radio);
    }

}
