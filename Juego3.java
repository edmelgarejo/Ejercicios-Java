/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercio3extrabis.entidad;

import java.util.Scanner;

/**
 *
 * @author MarinaElizabeth
 */
public class Juego {
     //Scanner leer = new Scanner(System.in);
    public String jugador1;
    public String jugador2;
    public int numero1;
    public int numero2;
    public int intentos;
    public int ganador;
    public int contador;
    public int opcion;
    public int contadorJugador1;
    public int contadorJugador2;

    public Juego(){
    }

    public Juego(String jugador1, String jugador2, int numero1, int numero2, int ganador, int contador, int opcion, int intentos,int contadorJugador1, int contadorJugador2){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.intentos = 3;
        this.ganador = ganador;
        this.contador = contador;
        this.opcion = opcion;
        this.contadorJugador1 = 0;
        this.contadorJugador2 = 0;
    }
    public void cargar(){
        Scanner leer = new Scanner (System.in);
        System.out.println("Introduzca su nombre (Jugador NÂ°1");
        jugador1 = leer.nextLine();
        System.out.println("Introduzca Su nombre (Jugador NÂ°2");
        jugador2 = leer.nextLine();
    }
  
    public void iniciar_juego(){
        Scanner leer = new Scanner (System.in);
        System.out.println("¿Quien comienza?");
        System.out.println("1-" + jugador1);
        System.out.println("2-" + jugador2);
        opcion = leer.nextInt();

        do {
            if (opcion == 1) {
                System.out.println("Introduzca el numero");
                numero1 = leer.nextInt();

                System.out.println(jugador2 + " adivina el numero introducido");
                numero2 = leer.nextInt();
                if (numero2 == numero1) {
                    System.out.println("Correcto");
                    contadorJugador1++;
                } else {
                    while (numero2 != numero1 || contador == intentos) {
                        if (numero2 < numero1) {
                            System.out.println("Mas Alto");
                        } else {
                            System.out.println("Mas Bajo");
                        }
                        contador++;
                        System.out.println("Le quedan " + contador + " intentos");
                        System.out.println("Introduzca otro numero");
                        numero2 = leer.nextInt();
                    }
                }
            } else if (opcion == 2) {
                System.out.println("Introduzca el numero");
                numero1 = leer.nextInt();

                System.out.println(jugador1 + " adivina el numero introducido");
                numero2 = leer.nextInt();
                if (numero2 == numero1) {
                    System.out.println("Correcto");
                    contadorJugador2++;
                } else {
                    while (numero2 != numero1 || contador == intentos) {
                        if (numero2 < numero1) {
                            System.out.println("Mas Alto");
                        } else {
                            System.out.println("Mas Bajo");
                        }
                        contador++;
                        System.out.println("Le quedan " + contador + " intentos");
                        System.out.println("Introduzca otro numero");
                        numero2 = leer.nextInt();
                    }
                }
            }

        }while(contadorJugador1 != 3 || contadorJugador2 != 3);
        System.out.println("Ganados" + contadorJugador1);
        System.out.println("Ganados" + contadorJugador2);
    }   
}
