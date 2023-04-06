/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio.n.pkg1.entidades;

import java.util.Scanner;

/**
 *
 * @author MarinaElizabeth
 */
public class Libro {

    public int IBM;
    public String titulo;
    public String autor;
    public int numeroPaginas;

    public Libro() {
    }

    public Libro(int IBM, String titulo, String autor, int numeroPaginas) {
        this.IBM = IBM;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void cargaLibro() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Introduzca el numero IBM del Libro");
        IBM = leer.nextInt();
        System.out.println("Introduzca el titulo del libro");
        titulo = leer.next();
        System.out.println("Introduzca el autor");
        autor = leer.next();
        System.out.println("Introduzca la cantidad de Paginas");
        numeroPaginas = leer.nextInt();
    }

    public void mostrarLibro() {
        System.out.println("El numero de IBM es: " + this.IBM);
        System.out.println("El titulo del libro es " + this.titulo);
        System.out.println("El autor del libro es " + this.autor);
        System.out.println("La cantidad de pagina es " + this.numeroPaginas);
    }
}
