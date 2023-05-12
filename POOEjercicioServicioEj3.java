/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicioservicioej3;

import pooejercicioservicioej3.Entidad.Persona;
import pooejercicioservicioej3.Servicio.PersonaServicio;

/**
 *
 * @author MarinaElizabeth
 */
public class POOEjercicioServicioEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServicio ps = new PersonaServicio();
        Persona[] VectorPersonas = new Persona[4];
        int[] VectorIMC = new int[4];
        boolean[] vectorEdad = new boolean[4];

        for (int i = 0; i < 4; i++) {
            VectorPersonas[i] = ps.crearPersona();
            VectorIMC[i] = ps.CalcularIMC(VectorPersonas[i]);
            vectorEdad[i] = ps.esMayordeEdad(VectorPersonas[i]);
        }
        int contador2 = 0;
        int contador0 = 0;
        int contador1 = 0;
        int mayorEdad = 0;

        for (int i = 0; i < 4; i++) {
            if (VectorIMC[i] == -1) {
                contador2++;
            } else if (VectorIMC[i] == 0) {
                contador0++;
            } else {
                contador1++;
            }

            if (vectorEdad[i]) {
                mayorEdad++;
            }
            
        }
        double sobre = (contador1*100)/4;
        double ideal = (contador0*100)/4;
        double debajo = (contador2*100)/4;
        double mayor = (mayorEdad*100)/4;
        double menor = (100-(mayorEdad*100)/4);
        
        System.out.println("El porcentaje de personas con sobrepeso es " + sobre);
        System.out.println("El porcentaje de personas con peso ideal es " +ideal);
        System.out.println("El porcentaje de personas por debajo de su peso es " + debajo);
        System.out.println("El porcentaje de mayor de edad es "+ mayor);
        System.out.println("El porcentaje de menores de edad es "+ menor);
    }
}
