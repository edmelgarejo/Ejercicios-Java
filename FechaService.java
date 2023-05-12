/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooutilidadej4.Entidad.Servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author W10
 */
public class FechaService {

    public Date preguntar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca su fecha de nacimiento");
        System.out.println("Día");
        int dia = leer.nextInt();
        System.out.println("Mes");
        int mes = leer.nextInt();
        System.out.println("Año");
        int anio = leer.nextInt();

        return new Date(anio - 1900, mes - 1, dia);

    }

    public Date FechaActual() {

        return new Date();
    }

    public int CantidadAnio(Date FechaActual, Date FechaNacimiento) {
        int anio = (int)(FechaActual.getYear() - FechaNacimiento.getYear());
        if (FechaActual.getMonth()<FechaNacimiento.getMonth()||FechaActual.getDay()<FechaNacimiento.getDay()){
            anio--;
        }
        return anio;
    }

}
