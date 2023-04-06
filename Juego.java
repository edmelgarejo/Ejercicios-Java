/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicioextra3.entidad;




import java.util.Scanner;



/**
 *
 * @author MarinaElizabeth
 */
public class Juego {
    Scanner leer = new Scanner (System.in);
    public String jugador1;
    public String jugador2;
    public int numero1;
    public int numero2;
    public int intentos = 3;
    public int ganador;
    public int contador;

    public Juego() {
    }

    public Juego(String jugador1, String jugador2, int numero1, int numero2,int ganador, int contador) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.ganador = ganador;
        this.contador = contador;
    }
   public void cargarNumero (){
       System.out.println("Introduzca su nombre (Jugador N°1");
       jugador1 = leer.nextLine();
       System.out.println("Introduzca el numero");
       numero1 = leer.nextInt();
       System.out.println("Introduzca Su nombre (Jugador N°2");
   }
   public void iniciar_juego (){
       System.out.println("Adivina el numero introducido");
       System.out.println("Introduzca un numero");
       numero2 = leer.nextInt();
       
   }
   
   
}

