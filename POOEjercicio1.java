/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio.n.pkg1.entidades;

import java.util.logging.Logger;

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


    
}
