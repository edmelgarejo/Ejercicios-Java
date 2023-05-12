/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciomarceloextra3.entidad;

import java.util.Scanner;

/**
 *
 * @author MarinaElizabeth
 */
public class Juego {
    private int jugador1;
    private int jugador2;
    private int contador1 = 0;
    private int contador2 = 0;

    public Juego() {
    }

    public Juego(int jugador1, int jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }

    public int getJugador1() {
        return jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugador1=" + jugador1 + ", jugador2=" + jugador2 + '}';
    }

    public void iniciarJuego() {

        Scanner leer = new Scanner(System.in);
        int cont = 0;
        int intentos = 4;
        String op = "";
        do {

            System.out.print("Ingrese el numero que sera buscado jugador1: ");
            this.jugador1 = leer.nextInt();
            leer.nextLine();
            //ahora el jugador 2 tiene que adivinar el numero 

            do {
                System.out.println("Jugador2, adivine el numero: ");
                this.jugador2 = leer.nextInt();
                leer.nextLine();

                if (this.jugador1 > this.getJugador2()) {
                    System.out.println("El numero es mas alto");
                    System.out.println("Le quedan " + intentos + " intentos");
                } else if (this.jugador1 < this.getJugador2()) {
                    System.out.println("El numero es mas bajo");
                    System.out.println("Le quedan " + intentos + " intentos");
                }
                intentos--;
                cont++;
            } while (cont < 5 && this.jugador1 != this.getJugador2());

            if (this.jugador1 == this.getJugador2()) {
                System.out.println("Acerto!");
                contador1++;
            } else {
                System.out.println("Perdio, vuelva a intentarlo");
                contador2++;
            }
            System.out.println("Desean seguir jugando?: S/N");
            op = leer.nextLine();
        } while (op.equalsIgnoreCase("s"));

        System.out.println("Felicidades por las partidas realizadas, los esperamos pronto!");
        System.out.println("Jugador1 gano: " + contador1 + " veces");
        System.out.println("Jugador2 gano: " + contador2 + " veces");

    }
}
