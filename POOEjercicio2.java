package pooejercicio2;

import pooejercicio2.entidad.Circunferencia;

public class POOEjercicio2 {

    public static void main(String[] args) {

        Circunferencia c1 = new Circunferencia();
        c1.cargaCircunferencia();
        System.out.println("El area es " + c1.area());
        System.out.println("El perimetro es " + c1.perimetro());
    }

}
