/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poocolectionsej3.Entidades;

import java.util.ArrayList;

/**
 *
 * @author W10
 */
public class Alumno {
    
    private String nombre;
    private ArrayList <Integer> notas; 

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    public double promedio() {//Funcion que me devuelve el promedio.
        int sum = 0;
        for (Integer nota : notas) {
            sum += nota;
        }
        return (double) sum / notas.size();
    }
}
