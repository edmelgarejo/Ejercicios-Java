/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicioservicioextra2.entidades;

/**
 *
 * @author MarinaElizabeth
 */
public class NIF {
    private int dni;
    private char letra;

    public NIF() {
    }

    public NIF(int dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public int getDni() {
        return dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    
    
}
