/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooutilidadej5.Entidad.Servicio;

import java.util.Date;
import java.util.Scanner;
import pooutilidadej5.Entidad.Persona;

/**
 *
 * @author W10
 */
public class PersonaServicio {
    
    Scanner leer = new Scanner (System.in);
    
    public void CrearPersona (Persona p1){
        System.out.println("Introduzca su Nombre");
        p1.setNombre(leer.nextLine());
        System.out.println("Introduzca su Apellido");
        p1.setApellido(leer.nextLine());
        System.out.println("Introduzca su fecha de nacimiento");
        System.out.println("Dia");
        int dia = leer.nextInt();
        System.out.println("Mes");
        int mes = leer.nextInt();
        System.out.println("anio");
        int anio = leer.nextInt();
        Date FechaNacimiento = new Date(anio-1900,mes-1,dia);
        p1.setFechaNacimiento(FechaNacimiento);
    }
    public int edad (Persona p1){ 
        Date FechaActual = new Date();
        int anio = (int)(FechaActual.getYear() - p1.getFechaNacimiento().getYear());
        if (FechaActual.getMonth()<p1.getFechaNacimiento().getMonth()||FechaActual.getDay()<p1.getFechaNacimiento().getDay()){
            anio--;
        }
        return anio;
    }
    public boolean menorQue(Persona p1,int edad1){
        if (edad (p1)<edad1){
        return true; 
    }else
        return false;
    }
    public void mostrarPersona(Persona p1){
        System.out.println("El nombre de la persona es "+p1.getNombre());
        System.out.println("El apellido de la persona es "+p1.getApellido());
        System.out.println("La fecha de nacimiento de la persona es "+p1.getFechaNacimiento());
        System.out.println("La edad de la persona es "+edad(p1));
    }
}
