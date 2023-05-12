/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicioservicioextra1.entidad.servicio;

import java.util.Scanner;
import pooejercicioservicioextra1.entidad.Raices;

/**
 *
 * @author MarinaElizabeth
 */
public class RaicesServicio {

    Scanner leer = new Scanner(System.in);

    public Raices CrearRaiz() {
        Raices r = new Raices();

        System.out.println("Introduzca el coeficienta a");
        r.setA(leer.nextDouble());

        System.out.println("Introduzca el coeficiente b");
        r.setB(leer.nextDouble());

        System.out.println("Introduzca el coeficiente c");
        r.setC(leer.nextDouble());

        return r;
    }

    public double getDiscriminante(Raices r) {
        double discriminante = Math.pow(r.getB(), 2) - 4 * (r.getA() * r.getC());
        return discriminante;
    }

    public boolean tieneRaices(Raices r, double discriminante) {
        boolean masSoluciones = false;
        if (discriminante > 0) {
            masSoluciones = true;
        }
        return masSoluciones;
    }

    public boolean tieneRaiz(Raices r, double discriminante) {
        boolean unicaSolucion = false;
        if (discriminante == 0) {
            unicaSolucion = true;
        }
        return unicaSolucion;
    }

    public void obtenerRaices(Raices r, double discriminante) {
        if (tieneRaices(r, discriminante) == true) {
            System.out.println("La raiz 1 es = " + (-r.getB() + Math.sqrt(discriminante)) / (2 * r.getA()));
            System.out.println("La raiz 2 es = " + (-r.getB() - Math.sqrt(discriminante)) / (2 * r.getA()));
        }
    }

    public void obtenerRaiz(Raices r, double discriminante) {
        if (tieneRaiz(r, discriminante) == true) {
            System.out.println("La raiz es " + (-r.getB() + Math.sqrt(discriminante)) / (2 * r.getA()));
        }
    }

    public void calcular(Raices r, double discriminante) {
        if (tieneRaices(r, discriminante) == false && tieneRaiz(r, discriminante) == false) {
            System.out.println("No tiene Solución");
        } else if (tieneRaiz(r, discriminante) == true) {
            obtenerRaiz(r, discriminante);
        } else {
            obtenerRaices(r, discriminante);
        }

    }

}
